package com.example.movieservice.controller.publicApi;

import com.example.movieservice.dto.request.MovieRequest;
import com.example.utils.BaseConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {

    @PostMapping("/movie")
    public ResponseEntity findMovieByCondition(@RequestBody MovieRequest movieRequest) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/person")
    public ResponseEntity findPersonByCode(@PathVariable("code") String code) {
        return new ResponseEntity(null, HttpStatus.OK);
    }


}
