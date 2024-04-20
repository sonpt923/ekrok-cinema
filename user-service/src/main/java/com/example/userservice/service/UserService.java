package com.example.userservice.service;

import com.example.userservice.dto.response.UserListResponse;
import com.example.userservice.entity.User;

public interface UserService {

    UserListResponse getUserByRole();

    User getUserInfo();

}
