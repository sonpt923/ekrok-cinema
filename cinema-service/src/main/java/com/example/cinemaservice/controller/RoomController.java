package com.example.cinemaservice.controller;

import com.example.cinemaservice.dto.request.RoomRequest;
import com.example.cinemaservice.service.RoomService;
import com.example.config.EnableWrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cinema")
@EnableWrapResponse
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/create-room")
    public ResponseEntity createRoom(@RequestBody RoomRequest request, @RequestHeader("Authorization") String tokne) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/update-room")
    public ResponseEntity updateRoome(@RequestBody RoomRequest request, @RequestHeader("Authorization") String tokne) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/get-room-by-condition")
    public ResponseEntity getRoomByCondition(@RequestBody RoomRequest request, @RequestHeader("Authorization") String tokne) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
