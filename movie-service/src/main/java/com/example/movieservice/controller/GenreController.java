package com.example.movieservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.movieservice.dto.request.GenreRequest;
import com.example.movieservice.entity.Genre;
import com.example.movieservice.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
@EnableWrapResponse
public class GenreController {

    @Autowired
    private GenreService genreService;

    @PostMapping("/create-genre")
    public ResponseEntity createGenre(@RequestBody Genre genre, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(genreService.createGenre(genre, token), HttpStatus.OK);
    }

    @PostMapping("/update-genre")
    public ResponseEntity udpateGenre(@RequestBody Genre genre, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(genreService.updateGenre(genre, token), HttpStatus.OK);
    }

    @PostMapping("/find-genre-by-condition")
    public ResponseEntity findGenreByCondition(@RequestBody GenreRequest request, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(genreService.getGenreByCondtion(request), HttpStatus.OK);
    }

}
