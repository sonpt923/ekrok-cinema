package com.example.userservice.dto.request;

import com.example.userservice.entity.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private Long id;

    private String email;

    private String username;

    private String fullName;

    private String phone;

    private Date birthDay;

    private String password;

    private String image;

    private Integer page;

    private Integer pageSize;

    private String otp;

    private String confirmPassword;

    private Group group;

}
