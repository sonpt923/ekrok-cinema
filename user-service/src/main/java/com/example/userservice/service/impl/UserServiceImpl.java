package com.example.userservice.service.impl;

import com.example.userservice.dto.response.UserListResponse;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private RedisTemplate redisTemplate;

//    @Autowired
//    private MailProvider mailProvider;

    @Override
    public UserListResponse getUserByCondition() {
        return null;
    }

    @Override
    public User getUserInfo(String username) {
        return userRepository.getUserByUsername(username);
    }
}
