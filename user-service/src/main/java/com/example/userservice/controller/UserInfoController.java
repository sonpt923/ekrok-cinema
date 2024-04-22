package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.userservice.security.JwtProvider;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-info")
@EnableWrapResponse
public class UserInfoController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtProvider jwtProvider;

    @GetMapping("/get-user-info-login")
    public ResponseEntity getUserInfor(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        String username = "jwtProvider.generateToken()";
        return ResponseEntity.ok(userService.getUserInfo(username));
    }

    @GetMapping("/get-user-by-condition")
    public ResponseEntity getUserByCondition() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/update-user-info")
    public ResponseEntity updateUserInfo() {
        return ResponseEntity.ok(null);
    }

}
