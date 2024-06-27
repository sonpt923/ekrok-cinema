package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.dto.request.PersonRequest;
import com.example.movieservice.entity.Person;
import com.example.movieservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
@EnableWrapResponse
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/create-people")
    public ResponseEntity createPeople(@RequestBody Person people, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(personService.createPeople(people, token), HttpStatus.OK);
    }

    @PostMapping("/update-people")
    public ResponseEntity updatePeople(@RequestBody Person people, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(personService.updatePeople(people, token), HttpStatus.OK);
    }

    @PostMapping("/find-people-by-condition")
    public ResponseEntity findPeopleByCondition(@RequestBody PersonRequest request) {
        return new ResponseEntity(personService.getPersonsByCondition(request), HttpStatus.OK);
    }

}
