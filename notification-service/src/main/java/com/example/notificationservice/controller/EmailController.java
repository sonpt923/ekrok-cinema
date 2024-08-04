package com.example.notificationservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.notificationservice.dto.request.EmailRequest;
import com.example.notificationservice.model.EmailTemplate;
import com.example.notificationservice.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@EnableWrapResponse
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/get-template")
    public ResponseEntity getTemplates(@RequestBody EmailRequest request) {
        return new ResponseEntity<>(emailService.getTemplate(request), HttpStatus.OK);
    }

    @PostMapping("/get-template-by-condition")
    public ResponseEntity getTemplate(@RequestBody EmailRequest request) {
        return new ResponseEntity<>(emailService.getTemplates(request), HttpStatus.OK);
    }

    @PostMapping("/create-template")
    public ResponseEntity createTemplate(@RequestBody EmailTemplate request) {
        return new ResponseEntity<>(emailService.createTemplate(request), HttpStatus.OK);
    }

    @PostMapping("/update-template")
    public ResponseEntity updateTemplate(@RequestBody EmailRequest request) {
        return new ResponseEntity<>(emailService.updateTemplate(request), HttpStatus.OK);
    }

    @PostMapping("/delete-template")
    public ResponseEntity deleteTemplate(@RequestBody EmailRequest request) {
        return new ResponseEntity<>(emailService.deleteTemplate(request), HttpStatus.OK);
    }

    @PostMapping("/send-otp")
    public ResponseEntity sendOTP(@RequestBody EmailRequest request) {
        return new ResponseEntity(emailService.sendOTP(request), HttpStatus.OK);
    }


}
