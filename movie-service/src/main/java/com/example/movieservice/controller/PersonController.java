package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.entity.Person;
import com.example.movieservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
@EnableWrapResponse
public class PersonController {

    @Autowired
    private PersonService peopleService;

    @PostMapping("/create-people")
    public ResponseEntity createPeople(@RequestBody Person people, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(peopleService.createPeople(people, token), HttpStatus.OK);
    }

    @PostMapping("/update-people")
    public ResponseEntity updatePeople(@RequestBody Person people, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(peopleService.updatePeople(people, token), HttpStatus.OK);
    }

    @PostMapping("/find-people-by-condition")
    public ResponseEntity findPeopleByCondition() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
