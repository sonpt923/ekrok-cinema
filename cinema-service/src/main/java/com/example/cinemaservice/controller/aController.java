package com.example.cinemaservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema")
public class aController {

    @GetMapping("/hello")
    public ResponseEntity hello() {
        return new ResponseEntity("hello", HttpStatus.OK);
    }

}
