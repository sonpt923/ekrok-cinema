package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.userservice.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping("/create-group")
    public ResponseEntity createGroup() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/update-group")
    public ResponseEntity updateGroup() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping("/group")
    public ResponseEntity getGroup() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity getGroups() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity deleteGroup() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity listGroups() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
