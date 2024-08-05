package com.example.bookingservice.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "discount-service")
public interface DiscountService {



}
