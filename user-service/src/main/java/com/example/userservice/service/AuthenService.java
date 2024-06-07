package com.example.userservice.service;

import com.example.userservice.entity.User;

public interface AuthenService {

    Object validateToken(String token);

    Object register(User request);

}
