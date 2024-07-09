package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-account")
    public ResponseEntity createAccount() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/update-account")
    public ResponseEntity updateAccount() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/delete-account")
    public ResponseEntity deleteAccount() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
