package com.example.apigateway.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "user-service")
public interface UserService {

    @PostMapping("/")
    ResponseEntity getAll();

}
