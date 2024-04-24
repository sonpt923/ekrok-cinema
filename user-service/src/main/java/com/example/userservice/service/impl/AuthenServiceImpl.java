package com.example.userservice.service.impl;

import com.example.userservice.entity.User;
import com.example.userservice.security.JwtProvider;
import com.example.userservice.service.AuthenService;
import com.example.userservice.service.UserService;
import com.example.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthenServiceImpl implements AuthenService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public Object validateToken(String token) {
        if (jwtProvider.isTokenExpired(token)) {
            log.error("Token is expired: {}", token);
            throw new RuntimeException();
        }
        String username = jwtProvider.getUsernameFromToken(token);
        User user = userService.getUserByUsernameAndStatus(username, 1L);
        if (user == null) {
            log.error("Token errors: {}", "user is not exist or is disable");
            throw new RuntimeException();
        }
        return Constants.SUCCESS;
    }

    @Override
    public Object register(User user) {
        String code = userService.genUserCode(Constants.ROLE_CODE.CLIENT);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCode(code);
        user.setCreatedBy(code);
        userService.createUser(user);
        return null;
    }


}
