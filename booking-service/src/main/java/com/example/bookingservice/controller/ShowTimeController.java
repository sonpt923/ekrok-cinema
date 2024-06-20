package com.example.bookingservice.controller;

import com.example.bookingservice.service.ShowTimeService;
import com.example.config.EnableWrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show-time")
@EnableWrapResponse
public class ShowTimeController {

    @Autowired
    private ShowTimeService service;

    public ResponseEntity createShowTime() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    public ResponseEntity updateShowTime() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
