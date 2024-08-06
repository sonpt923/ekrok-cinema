package com.example.userservice.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.Notification;

@Component
@FeignClient(name = "notification-service")
public interface NotificationService {

    @PostMapping(value = "/")
    ResponseEntity<?> sendNotification(@RequestBody Notification notification);

    @PostMapping(value = "")
    ResponseEntity<?> sendMailOTPConfirmation(@RequestParam("email") String email);


}
