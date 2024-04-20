package com.example.userservice.service.impl;

import com.example.userservice.security.JwtProvider;
import com.example.userservice.service.AuthenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenServiceImpl implements AuthenService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RedisTemplate redisTemplate;

//    @Autowired
//    private JwtProvider jwtProvider;

}
