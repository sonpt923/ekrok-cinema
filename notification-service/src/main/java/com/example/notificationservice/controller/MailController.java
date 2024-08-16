package com.example.notificationservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.notificationservice.dto.request.MailRequest;
import com.example.notificationservice.model.MailTemplate;
import com.example.notificationservice.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@EnableWrapResponse
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/get-template/{id}")
    public ResponseEntity getTemplates(@RequestParam("id") Long id) {
        return new ResponseEntity<>(mailService.getTemplate(id), HttpStatus.OK);
    }

    @PostMapping("/get-template-by-condition")
    public ResponseEntity getTemplate(@RequestBody MailRequest request) {
        return new ResponseEntity<>(mailService.getTemplates(request), HttpStatus.OK);
    }

    @PostMapping("/create-template")
    public ResponseEntity createTemplate(@RequestBody MailTemplate request) {
        return new ResponseEntity<>(mailService.createTemplate(request), HttpStatus.OK);
    }

    @PutMapping("/update-template")
    public ResponseEntity updateTemplate(@RequestBody MailRequest request) {
        return new ResponseEntity<>(mailService.updateTemplate(request), HttpStatus.OK);
    }

    @DeleteMapping("/delete-template")
    public ResponseEntity deleteTemplate(@RequestBody MailRequest request) {
        return new ResponseEntity<>(mailService.deleteTemplate(request), HttpStatus.OK);
    }
}
