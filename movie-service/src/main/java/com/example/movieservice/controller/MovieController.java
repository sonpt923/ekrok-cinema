package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.dto.request.GenreRequest;
import com.example.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
@EnableWrapResponse
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/create-movie")
    public ResponseEntity createMovie(@RequestBody GenreRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/update-movie")
    public ResponseEntity updateMovie(@RequestBody GenreRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/delete-movie")
    public ResponseEntity deleteMovie(@RequestBody GenreRequest directorRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(directorRequest.toString(), HttpStatus.OK);
    }

    @PostMapping("/find-movie-by-condition")
    public ResponseEntity findMovieByCondition(@RequestBody GenreRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(null, HttpStatus.OK);
    }


}
