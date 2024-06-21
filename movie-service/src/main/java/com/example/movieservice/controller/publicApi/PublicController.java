package com.example.movieservice.controller.publicApi;

import com.example.movieservice.dto.request.MovieRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    // detail(actor, movie, producer, genre, poster, backgroup)
    @PostMapping("/movie")
    public ResponseEntity findMovieByCondition(@RequestBody MovieRequest movieRequest) {
        return new ResponseEntity(null, HttpStatus.OK);
    }


}
