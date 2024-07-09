package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public ResponseEntity getUserInfo() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/change-password")
    public ResponseEntity changePassword() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/update-info")
    public ResponseEntity updateUserInfo() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
