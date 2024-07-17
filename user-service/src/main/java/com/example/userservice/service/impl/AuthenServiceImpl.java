package com.example.userservice.service.impl;

import com.example.userservice.repository.UserRepository;
import com.example.userservice.repository.redis.TokenCacheRepository;
import com.example.userservice.security.JwtProvider;
import com.example.userservice.service.AuthenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

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


    @Override
    public Object createAccount() {
        return null;
    }

    @Override
    public Object login() {
        return null;
    }

    @Override
    public Object register() {
        return null;
    }

    @Override
    public Object forgotPassword() {
        return null;
    }
}
