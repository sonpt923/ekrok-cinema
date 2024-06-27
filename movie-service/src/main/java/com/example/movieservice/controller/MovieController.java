package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.dto.request.GenreRequest;
import com.example.movieservice.dto.request.MovieRequest;
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
    public ResponseEntity createMovie(@RequestBody MovieRequest request, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(movieService.createMovie(request, token), HttpStatus.OK);
    }

    @PostMapping("/update-movie")
    public ResponseEntity updateMovie(@RequestBody MovieRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(movieService.updateMovie(request, token), HttpStatus.OK);
    }

    @PostMapping("/find-movie-by-condition")
    public ResponseEntity findMovieByCondition(@RequestBody MovieRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return new ResponseEntity(movieService.getMovieBycondition(request), HttpStatus.OK);
    }


}
