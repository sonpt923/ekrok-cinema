package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.dto.request.DirectorRequest;
import com.example.movieservice.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/director")
@EnableWrapResponse
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @PostMapping("/create-director")
    public ResponseEntity createDirector(@RequestBody DirectorRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/update-director")
    public ResponseEntity udpateDirector(@RequestBody DirectorRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/delete-director")
    public ResponseEntity deleteDirector(@RequestBody DirectorRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/find-director-by-condition")
    public ResponseEntity findDirectorByCondition(@RequestBody DirectorRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
