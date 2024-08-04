package com.example.userservice.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.Notification;

@Component
@FeignClient(name = "${spring.rest.notification.name")
public interface NotificationService {

    @PostMapping(value = "/")
    Object sendNotification(@RequestBody Notification notification);

    @PostMapping(value = "")
    Object sendMailOTPConfirmation(@RequestParam("email") String email);


}
