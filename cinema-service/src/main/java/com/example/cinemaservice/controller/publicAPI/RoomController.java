package com.example.cinemaservice.controller.publicAPI;

import com.example.config.EnableWrapResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/public")
public class RoomController {

    @GetMapping("/hello")
    public ResponseEntity hello() {
        return new ResponseEntity("hello", HttpStatus.OK);
    }

}
