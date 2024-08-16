package com.example.userservice.controller.PublicAPI;

import com.example.config.EnableWrapResponse;
import com.example.userservice.dto.request.UserRequest;
import com.example.userservice.entity.User;
import com.example.userservice.entity.google.UserInfo;
import com.example.userservice.entity.redisCache.OTPCache;
import com.example.userservice.repository.redis.OTPCacheRepository;
import com.example.userservice.service.AuthenService;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/auth")
public class AuthenController {

    @Autowired
    private AuthenService authenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody User user) throws Exception {
        return new ResponseEntity(authenService.login(user), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody UserRequest request) {
        return new ResponseEntity(authenService.register(request), HttpStatus.OK);
    }

    @PostMapping("/register-by-google")
    public ResponseEntity registerByGoogle(@RequestBody UserInfo userInfo) {
        return new ResponseEntity(authenService.loginByGoogle(userInfo), HttpStatus.OK);
    }

    @PostMapping("/login-by-google")
    public ResponseEntity loginByGoogle(@RequestBody UserInfo userInfo) {
        return new ResponseEntity(authenService.registerByGoogle(userInfo), HttpStatus.OK);
    }

    @PostMapping("/forgot-password")
    public ResponseEntity forgotPassword(@RequestBody User user) {
        return new ResponseEntity(authenService.forgotPassword(user), HttpStatus.OK);
    }

    @PostMapping("/change-password")
    public ResponseEntity changePassword(UserRequest user) {
        return new ResponseEntity(authenService.changePassword(user), HttpStatus.OK);
    }

}
