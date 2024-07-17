package com.example.userservice.controller.PublicAPI;

import com.example.config.EnableWrapResponse;
import com.example.userservice.service.AuthenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/user/auth")
public class AuthenController {

    @Autowired
    private AuthenService authenService;

    @PostMapping("/login")
    public ResponseEntity login() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity register() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/register-by-google")
    public ResponseEntity registerByGoogle() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/login-by-google")
    public ResponseEntity loginBygoogle() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/forgot-password")
    public ResponseEntity forGotPassword() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/change-password")
    public ResponseEntity changePassword() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
