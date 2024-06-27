package com.example.movieservice.controller.publicApi;

import com.example.config.EnableWrapResponse;
import com.example.dto.common.MessageResponseDTO;
import com.example.movieservice.dto.request.MovieRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movie/public")
@EnableWrapResponse
public class PublicController {

    @PostMapping("/movie")
    public ResponseEntity findMovieByCondition(@RequestBody MovieRequest movieRequest) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/person")
    public ResponseEntity findPersonByCode(@PathVariable("code") String code) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/test")
    public String testController() {
        return "test";
    }


}
