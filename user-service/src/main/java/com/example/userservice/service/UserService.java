package com.example.userservice.service;

import com.example.userservice.dto.request.UserRequest;

public interface UserService {

    Object createUser(UserRequest userRequest);

    Object updateUser(UserRequest userRequest);

    Object deleteUser(UserRequest userRequest);

    Object findAll(UserRequest userRequest);

}
