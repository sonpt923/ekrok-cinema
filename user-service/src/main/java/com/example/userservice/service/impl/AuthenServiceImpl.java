package com.example.userservice.service.impl;

import com.example.exception.ValidationException;
import com.example.service.MydictionaryService;
import com.example.userservice.dto.request.UserRequest;
import com.example.userservice.entity.User;
import com.example.userservice.entity.redisCache.OTPCache;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.repository.redis.OTPCacheRepository;
import com.example.userservice.repository.redis.TokenCacheRepository;
import com.example.userservice.security.JwtProvider;
import com.example.userservice.service.AuthenService;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthenServiceImpl implements AuthenService {

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private TokenCacheRepository tokenRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MydictionaryService dictionaryService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OTPCacheRepository otpCacheRepository;


    @Override
    public Object createAccount() {
        return null;
    }

    @Override
    public Object login(User request) {
        User user = userRepository.findUserByUsername(request.getUsername());
        if (!StringUtil.stringIsNullOrEmty(user)) {
            if (passwordEncoder.matches(user.getPassword(), user.getPassword())) {
                // create token
                // luu vao cache
                // cho nguoi dung dang key:value
            }
        }
        throw new ValidationException(BaseConstants.ERROR_DATA_NOT_FOUND, dictionaryService.get("ERROR.DATA_IS_EXIST"));
    }

    @Override
    public Object register(UserRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .birthDay(request.getBirthDay())
                .fullName(request.getFullName())
                .createdBy(request.getUsername())
                .build();
        return null;
    }

    @Override
    public Object forgotPassword(User user) {
        if (StringUtil.stringIsNullOrEmty(user.getUsername())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionaryService.get("ERROR.APP_IS_NOT_MANAGE"), ""));
        }
        String email = userRepository.findUserByUsernameOrEmail(user.getUsername()).getEmail();
        if (StringUtil.stringIsNullOrEmty(email)) {
            throw new ValidationException(BaseConstants.ERROR_DATA_NOT_FOUND, dictionaryService.get("ERROR.NOT_FOUND_DATA"));
        }
        OTPCache otpCache = new OTPCache(StringUtil.generateString(8), user.getUsername());
        otpCacheRepository.save(otpCache);
        // send thong bao sang mail-service
        return null;
    }

    @Override
    public Object changePassword(UserRequest request) {
        if (StringUtil.stringIsNullOrEmty(request.getPassword())
                || StringUtil.stringIsNullOrEmty(request.getConfirmPassword())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format("", ""));
        }
        if (request.getPassword().equals(request.getConfirmPassword())) {
            User user = userRepository.findUserByUsername(request.getUsername());
            user.setPassword(passwordEncoder.encode(request.getPassword()));
            userRepository.save(user);
            return null;
        }
        return null;
    }
}
