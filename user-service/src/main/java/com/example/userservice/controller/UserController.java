package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.userservice.dto.request.UserRequest;
import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-account")
    public ResponseEntity createAccount(@ModelAttribute UserRequest request) {
        return new ResponseEntity(userService.createUser(request), HttpStatus.OK);
    }

    @PutMapping("/update-account")
    public ResponseEntity updateAccount(UserRequest request) {
        return new ResponseEntity(userService.updateUser(request), HttpStatus.OK);
    }

    @DeleteMapping("/delete-account")
    public ResponseEntity deleteAccount() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/find-account-by-condition")
    public ResponseEntity findAll(@RequestBody UserRequest request){
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
