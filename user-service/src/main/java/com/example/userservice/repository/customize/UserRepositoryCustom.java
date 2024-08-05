package com.example.userservice.repository.customize;

import com.example.dto.base.ListDataResponse;
import com.example.userservice.dto.request.UserRequest;

public interface UserRepositoryCustom {

    ListDataResponse<Object> findAccountByCondition(UserRequest request);

}
