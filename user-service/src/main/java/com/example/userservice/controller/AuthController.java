package com.example.userservice.controller;

import com.example.userservice.service.AuthenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenService authenService;

    @PostMapping("/login")
    public ResponseEntity login() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/register")
    public ResponseEntity register() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/login-google")
    public ResponseEntity loginGoole() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/forgot-password")
    public ResponseEntity forGotPassword() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/validate-token")
    public ResponseEntity validateToken() {
        return ResponseEntity.ok(null);
    }


}
