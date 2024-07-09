package com.example.userservice.service.impl;

import com.example.config.AwsConfig;
import com.example.userservice.dto.request.UserRequest;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AwsConfig awsConfig;

    @Override
    public Object createUser(UserRequest userRequest) {
        File file = new File(Base64.decodeBase64(userRequest.getImage()).toString());
        return null;
    }

    @Override
    public Object updateUser(UserRequest userRequest) {
        return null;
    }
}
