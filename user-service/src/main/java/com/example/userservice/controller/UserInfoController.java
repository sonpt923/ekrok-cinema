package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-info")
@EnableWrapResponse
public class UserInfoController {

    @Autowired
    private UserService userService;

    @PostMapping("/user-info-login")
    public ResponseEntity getUserInfor() {
        return ResponseEntity.ok(userService.getUserInfo());
    }

    @PostMapping("/get-user-by-role")
    public ResponseEntity getUserByRole() {
        return ResponseEntity.ok(userService.getUserByRole());
    }

}
