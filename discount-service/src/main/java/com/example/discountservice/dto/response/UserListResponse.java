package com.example.userservice.dto.response;

import com.example.userservice.entity.User;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserListResponse {

    private Set<User> userList;

    private Integer totalRecord;

}
