package com.example.movieservice.controller.publicApi;

import com.example.movieservice.dto.request.MovieRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/public")
public class PublicController {

    @PostMapping("/find-movie-by-condition")
    public ResponseEntity findMovieByCondition(@RequestBody MovieRequest movieRequest) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
