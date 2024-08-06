package com.example.notificationservice.controller.publicAPI;

import com.example.config.EnableWrapResponse;
import com.example.notificationservice.dto.request.MailRequest;
import com.example.notificationservice.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@EnableWrapResponse
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send-otp")
    public ResponseEntity sendOTP(MailRequest request) {
        return new ResponseEntity(mailService.sendOTP(request), HttpStatus.OK);
    }

}
