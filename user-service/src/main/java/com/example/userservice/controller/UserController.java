package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.userservice.dto.request.UserRequest;
import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public ResponseEntity createAccount(@ModelAttribute User user) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/update-user")
    public ResponseEntity updateAccount() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/delete-user")
    public ResponseEntity deleteAccount() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/find-all")
    public ResponseEntity findAll(@RequestBody UserRequest request){
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
