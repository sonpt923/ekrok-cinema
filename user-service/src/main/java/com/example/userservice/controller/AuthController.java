package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.config.RestTemplateConfig;
import com.example.userservice.entity.User;
import com.example.userservice.service.AuthenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/auth")
@EnableWrapResponse
public class AuthController {

    @Autowired
    private AuthenService authenService;

    @PostMapping("/login")
    public ResponseEntity login() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User request) {
        return ResponseEntity.ok(authenService.register(request));
    }

    @PostMapping("/login-google")
    public ResponseEntity loginGoole() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/forgot-password")
    public ResponseEntity forGotPassword() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/validate-token")
    public ResponseEntity validateToken(@RequestParam("token") String token) {
        return ResponseEntity.ok(authenService.validateToken(token));
    }


}
