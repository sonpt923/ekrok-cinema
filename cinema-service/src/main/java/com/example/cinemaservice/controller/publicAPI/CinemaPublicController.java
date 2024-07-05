package com.example.cinemaservice.controller.publicAPI;

import com.example.config.EnableWrapResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema/public")
@EnableWrapResponse
public class CinemaPublicController {

    @GetMapping("/test")
    public String test() {
        return "this is message for public api test";
    }

    @PostMapping("/city")
    public ResponseEntity getAllCity() {
        return null;
    }

    @PostMapping("/")
    public ResponseEntity getAllmove() {
        return null;
    }


}
