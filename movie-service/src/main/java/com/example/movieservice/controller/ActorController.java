package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.dto.request.ActorRequest;
import com.example.movieservice.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actor")
@EnableWrapResponse
public class ActorController {

    @Autowired
    private ActorService actorService;

    @PostMapping("/create-actor")
    public ResponseEntity createActor(@RequestBody ActorRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(actorService.createActor(request, ""), HttpStatus.OK);
    }

    @PostMapping("/update-actor")
    public ResponseEntity updateActor(@RequestBody ActorRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(actorService.updateActor(request, ""), HttpStatus.OK);
    }

    @PostMapping("/delete-actor")
    public ResponseEntity deleteActor(@RequestBody ActorRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(null, HttpStatus.OK);
    }


}
