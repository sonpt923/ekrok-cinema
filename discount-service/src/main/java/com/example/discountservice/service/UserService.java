package com.example.userservice.service;

import com.example.userservice.dto.response.UserListResponse;
import com.example.userservice.entity.User;

public interface UserService {

    UserListResponse getUserByCondition();

    User getUserInfo(String username);

    User getUserByUsernameAndStatus(String username, long status);

    String genUserCode(String role);

    User createUser(User user);

}
