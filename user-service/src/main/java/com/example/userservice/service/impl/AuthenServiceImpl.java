package com.example.userservice.service.impl;

import com.example.userservice.service.AuthenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenServiceImpl implements AuthenService {

    @Autowired
    private PasswordEncoder passwordEncoder;




    @Override
    public Object validateToken(String token) {
        // token conf hạn k
        // token co chua dung thong tin username khong
        //
        return null;
    }

//    @Autowired
//    private RedisTemplate redisTemplate;

//    @Autowired
//    private JwtProvider jwtProvider;

}
