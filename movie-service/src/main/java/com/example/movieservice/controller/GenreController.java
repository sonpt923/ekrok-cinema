package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.dto.request.DirectorRequest;
import com.example.movieservice.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genre")
@EnableWrapResponse
public class GenreController {

    @Autowired
    private GenreService genreService;

    @PostMapping("/create-genre")
    public ResponseEntity createGenre(@RequestBody DirectorRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/update-genre")
    public ResponseEntity udpateGenre(@RequestBody DirectorRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/delete-genre")
    public ResponseEntity deleteGenre(@RequestBody DirectorRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/find-genre-by-condition")
    public ResponseEntity findGenreByCondition(@RequestBody DirectorRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
