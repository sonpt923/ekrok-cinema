package com.example.userservice.service.impl;

import com.example.exception.AppException;
import com.example.exception.SystemException;
import com.example.exception.ValidationException;
import com.example.service.MydictionaryService;
import com.example.userservice.dto.request.UserRequest;
import com.example.userservice.entity.ApDomain;
import com.example.userservice.entity.User;
import com.example.userservice.entity.google.UserInfo;
import com.example.userservice.entity.redisCache.OTPCache;
import com.example.userservice.entity.redisCache.SecurityCache;
import com.example.userservice.repository.ApDomainRepository;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.repository.redis.OTPCacheRepository;
import com.example.userservice.repository.redis.TokenCacheRepository;
import com.example.userservice.security.JwtProvider;
import com.example.userservice.service.AuthenService;
import com.example.userservice.service.feign.NotificationService;
import com.example.userservice.utils.Constant;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class AuthenServiceImpl implements AuthenService {

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MydictionaryService dictionaryService;

    @Autowired
    private OTPCacheRepository otpCacheRepository;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private TokenCacheRepository tokenCacheRepository;

    @Autowired
    private ApDomainRepository apDomainRepository;

    @Override
    public Object login(User request) {
        User user = userRepository.findUserByUsername(request.getUsername());
        if (!StringUtil.stringIsNullOrEmty(user)) {
            if (passwordEncoder.matches(user.getPassword(), user.getPassword())) {
                try {
                    String token = jwtProvider.generateTokenRSA(request.getEmail());
                    String key = UUID.randomUUID().toString();
                    SecurityCache cache = new SecurityCache(key, 8L, token);
                    tokenCacheRepository.save(cache);
                    return new HashMap<>(Map.of("authen-key", key));
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new AppException("", "");
                }
            }
        }
        throw new ValidationException(BaseConstants.ERROR_DATA_NOT_FOUND,
                dictionaryService.get("ERROR.DATA_IS_EXIST"));
    }

    @Override
    public Object register(UserRequest request) {
        validateRegister(request);
        User user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .birthDay(request.getBirthDay())
                .fullName(request.getFullName())
                .createdBy(request.getUsername())
                .build();
        ResponseEntity response = notificationService.sendNotification(null);
        if (response.getStatusCode() == HttpStatus.OK) {
            return userRepository.save(user);
        }
        throw new AppException(BaseConstants.ERROR_CREATE_STAFF, dictionaryService.get("ERROR.CREATE_ACCOUNT_FAIL"));
    }

    @Override
    public Object forgotPassword(User user) {
        if (StringUtil.stringIsNullOrEmty(user.getUsername())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL,
                    String.format(dictionaryService.get("ERROR.APP_IS_NOT_MANAGE"), ""));
        }
        String email = userRepository.findUserByUsernameOrEmail(user.getUsername()).getEmail();
        if (StringUtil.stringIsNullOrEmty(email)) {
            throw new ValidationException(BaseConstants.ERROR_DATA_NOT_FOUND, dictionaryService.get("ERROR.NOT_FOUND_DATA"));
        }
        Long otpTime = 0L;
        ApDomain apDomain = apDomainRepository.getByCode(Constant.AP_DOMAIN.OTP_CODE);
        try {
            otpTime = Long.valueOf(apDomain.getValue());
        } catch (Exception e) {
            otpTime = Constant.OTP_TIME;
        }
        OTPCache otpCache = new OTPCache(user.getUsername(), otpTime, StringUtil.generateString(Constant.OTP_LENGTH));
        otpCacheRepository.save(otpCache);
        ResponseEntity response = notificationService.sendNotification(null);
        if (response.getStatusCode() == HttpStatus.OK) {
            return null;
        }
        throw new SystemException("", "");
    }

    @Override
    public Object changePassword(UserRequest request) {
        if (StringUtil.stringIsNullOrEmty(request.getPassword())
                || StringUtil.stringIsNullOrEmty(request.getConfirmPassword())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(Constant.ERROR_NOT_NULL, "password"));
        }
        if (request.getPassword().equals(request.getConfirmPassword())) {
            User user = userRepository.findUserByUsername(request.getUsername());
            user.setPassword(passwordEncoder.encode(request.getPassword()));
            return userRepository.save(user);
        }
        throw new ValidationException(Constant.ERROR_PASS_NOT_COMPARE, dictionaryService.get("ERROR.CHANGE_PASS.002"));
    }

    @Override
    public Object loginByGoogle(UserInfo user) {
        return null;
    }

    @Override
    public Object registerByGoogle(UserInfo user) {
        return null;
    }


    private void validateRegister(UserRequest request) {

        if (StringUtil.stringIsNullOrEmty(request.getUsername())) {
            throw new ValidationException(BaseConstants
                    .ERROR_NOT_NULL, String.format(dictionaryService.get(""), ""));
        }

        if (StringUtil.stringIsNullOrEmty(request.getPassword())) {
            throw new ValidationException(BaseConstants.ERROR_PASSWORD_NOT_NULL
                    , String.format(dictionaryService.get(""), ""));
        }

        if (StringUtil.stringIsNullOrEmty(request.getConfirmPassword())) {
            throw new ValidationException(BaseConstants.ERROR_PASSWORD_NOT_NULL,
                    String.format(dictionaryService.get("ERROR.CHANGE_PASS.001"), ""));
        }

        if (StringUtil.stringIsNullOrEmty(request.getBirthDay())) {
            throw new ValidationException(BaseConstants
                    .ERROR_NOT_NULL, String.format(dictionaryService.get(""), ""));
        }
    }
}
