package com.example.cinemaservice.controller;

import com.example.cinemaservice.entity.RoomType;
import com.example.cinemaservice.service.RoomTypeService;
import com.example.config.EnableWrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room-type")
@EnableWrapResponse
public class RoomTypeController {

    @Autowired
    private RoomTypeService roomTypeService;

    @PostMapping("/create-room-type")
    public ResponseEntity createRoomType(RoomType roomType) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/update-room-type")
    public ResponseEntity updateRoomType(RoomType roomType) {
        return new ResponseEntity(null, HttpStatus.OK);
    }


}
