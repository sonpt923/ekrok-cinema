package com.example.apigateway.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service")
public interface UserService {

    @PostMapping("/get-token")
    ResponseEntity getAll();

    @PostMapping("/check-role")
    ResponseEntity checkRole(@RequestParam("role") String role);

}
