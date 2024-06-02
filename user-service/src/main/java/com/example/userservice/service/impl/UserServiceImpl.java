package com.example.userservice.service.impl;

import com.example.userservice.dto.response.UserListResponse;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private RedisTemplate redisTemplate;


    @Override
    public UserListResponse getUserByCondition() {
        return null;
    }

    @Override
    public User getUserInfo(String code) {
        return userRepository.getUserByCode(code);
    }

    @Override
    public User getUserByUsernameAndStatus(String code, long status) {
        return userRepository.getUserByCodeAndStatus(code, status);
    }

    @Override
    public String genUserCode(String role) {
        String code = role;
        while (true) {
            code += StringUtil.generateString(6);
            if (!userRepository.existsByCode(code)) {
                break;
            }
        }
        return code;
    }

    @Override
    public User createUser(User user) {
        return null;
    }
}
