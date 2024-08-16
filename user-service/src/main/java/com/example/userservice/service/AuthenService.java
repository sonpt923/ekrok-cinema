package com.example.userservice.service;

import com.example.userservice.dto.request.UserRequest;
import com.example.userservice.entity.User;
import com.example.userservice.entity.google.UserInfo;

public interface AuthenService {

    Object login(User user) throws Exception;

    Object register(UserRequest request);

    Object forgotPassword(User user);

    Object changePassword(UserRequest user);

    Object loginByGoogle(UserInfo user);

    Object registerByGoogle(UserInfo user);

}
