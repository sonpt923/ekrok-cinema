package com.example.cinemaservice.controller.publicAPI;

import com.example.config.EnableWrapResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@EnableWrapResponse
public class CinemaPublicController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


}
