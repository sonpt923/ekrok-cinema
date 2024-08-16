package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.userservice.entity.ApDomain;
import com.example.userservice.service.ApDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap-domain")
@EnableWrapResponse
public class ApDomainController {

    @Autowired
    private ApDomainService apDomainService;

    @PostMapping("/create")
    public ResponseEntity createApDomain(@RequestBody ApDomain apDomain, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(apDomainService.create(apDomain, token), HttpStatus.OK);
    }

    @GetMapping("/get-ap-domain")
    public ResponseEntity getApDomainByCode(@RequestParam("code") String code, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(apDomainService.getByCode(code, token), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity updateApDomain(@RequestBody ApDomain apDomain, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(apDomainService.update(apDomain, token), HttpStatus.OK);
    }


}
