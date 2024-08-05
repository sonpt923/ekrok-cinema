package com.example.bookingservice.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service")
public interface UserService {



}
