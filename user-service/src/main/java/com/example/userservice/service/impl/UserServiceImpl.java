package com.example.userservice.service.impl;

import com.example.config.AwsConfig;
import com.example.exception.SystemException;
import com.example.exception.ValidationException;
import com.example.service.MydictionaryService;
import com.example.userservice.dto.request.UserRequest;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.GroupUserService;
import com.example.userservice.service.UserService;
import com.example.userservice.service.feign.NotificationService;
import com.example.userservice.utils.Constant;
import com.example.utils.BaseConstants;
import com.example.utils.StringUtil;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AwsConfig awsConfig;

    @Autowired
    private MydictionaryService dictionary;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private GroupUserService groupUserService;

    @Override
    @Transactional
    public Object createUser(UserRequest userRequest) {
        validateCreateUser(userRequest);
        File file = new File(Base64.decodeBase64(userRequest.getImage()).toString());
        String username = StringUtil.genUsernameFromFullname(userRequest.getFullName());
        String password = passwordEncoder.encode(userRequest.getPassword());
        User user = User.builder()
                .birthDay(userRequest.getBirthDay()).email(userRequest.getEmail())
                .fullName(userRequest.getFullName()).image("")
                .status(Constant.user.ACTIVE).password(password)
                .username(username).build();
        // gui mail thong bao cho user
//        Map<String, Object> response = (Map<String, Object>) notificationService.sendNotification(null);
//        if (response.getStatusCode() != HttpStatus.OK) {
//            throw new SystemException("", "");
//        }
        // them user vao nhom duoc chi dinh
        user = repository.save(user);
        // put image len s3
//        awsConfig.s3Client().putObject(file, "")
        return user;
    }

    @Override
    @Transactional
    public Object updateUser(UserRequest userRequest) {
        validateUpdateUser(userRequest);
        File file = new File(Base64.decodeBase64(userRequest.getImage()).toString());
        String username = StringUtil.genUsernameFromFullname(userRequest.getFullName());
        String password = passwordEncoder.encode(userRequest.getPassword());
        User user = User.builder()
                .birthDay(userRequest.getBirthDay()).email(userRequest.getEmail())
                .fullName(userRequest.getFullName()).image("")
                .status(Constant.user.ACTIVE).password(password)
                .username(username).build();
        ResponseEntity response = new ResponseEntity<>();
        if (response.getStatusCode() != HttpStatus.OK) {
            throw new SystemException("", "");
        }
        // them user vao nhom duoc chi dinh
        user = repository.save(user);
        return null;
    }

    @Override
    @Transactional
    public Object deleteUser(UserRequest userRequest) {
        if (StringUtil.stringIsNullOrEmty(userRequest.getId())) {

        }

        return null;
    }

    @Override
    public Object findAll(UserRequest userRequest) {
        return null;
    }

    private void validateCreateUser(UserRequest userRequest) {

        if (StringUtil.stringIsNullOrEmty(userRequest.getFullName())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get(""), "full name"));
        }

        if (StringUtil.stringIsNullOrEmty(userRequest.getEmail())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get(""), "email"));
        }

        if (StringUtil.stringIsNullOrEmty(userRequest.getPhone())) {
//            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary))
        }

    }

    private void validateUpdateUser(UserRequest userRequest) {
        if (StringUtil.stringIsNullOrEmty(userRequest.getFullName())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get(""), "full name"));
        }

        if (StringUtil.stringIsNullOrEmty(userRequest.getEmail())) {
            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary.get(""), "email"));
        }

        if (StringUtil.stringIsNullOrEmty(userRequest.getPhone())) {
//            throw new ValidationException(BaseConstants.ERROR_NOT_NULL, String.format(dictionary))
        }
    }

    private void validateDeleteUser(UserRequest request) {

        if (StringUtil.stringIsNullOrEmty(request.getId())) {

        }

    }

}
