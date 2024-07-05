package com.example.cinemaservice.controller;

import com.example.cinemaservice.dto.request.RoomRequest;
import com.example.cinemaservice.service.RoomService;
import com.example.config.EnableWrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema")
@EnableWrapResponse
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/create-room")
    public ResponseEntity createRoom(@RequestBody RoomRequest request, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(roomService.createRoome(request, token), HttpStatus.OK);
    }

    @PostMapping("/update-room")
    public ResponseEntity updateRoome(@RequestBody RoomRequest request, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(roomService.updateRoom(request, token), HttpStatus.OK);
    }

    @PostMapping("/get-room-by-condition")
    public ResponseEntity getRoomByCondition(@RequestBody RoomRequest request, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(roomService.getRoomByCondition(request, token), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity getRoom(@PathVariable Long idRoom) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
