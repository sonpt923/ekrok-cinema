package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.dto.request.DirectorRequest;
import com.example.movieservice.service.MovieService;
import com.example.movieservice.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
@EnableWrapResponse
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/create-producer")
    public ResponseEntity createMovie(@RequestBody DirectorRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/update-producer")
    public ResponseEntity updateMovie(@RequestBody DirectorRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/delete-producer")
    public ResponseEntity deleteMovie(@RequestBody DirectorRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/find-producer-by-condition")
    public ResponseEntity findMovieByCondition(@RequestBody DirectorRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(null, HttpStatus.OK);
    }


}
