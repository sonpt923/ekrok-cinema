package com.example.bookingservice.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "cinema-service")
public interface CinemaService {

    @PostMapping("/")
    ResponseEntity demo();



}
