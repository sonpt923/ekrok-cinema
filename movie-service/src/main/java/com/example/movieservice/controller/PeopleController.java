package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
@EnableWrapResponse
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @PostMapping("/")
    public ResponseEntity createPeople() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity updatePeople() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
