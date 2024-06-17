package com.example.cinemaservice.controller;

import com.example.cinemaservice.entity.ChairType;
import com.example.cinemaservice.service.ChairTypeService;
import com.example.config.EnableWrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chair-type")
@EnableWrapResponse
public class ChairTypeController {

    @Autowired
    private ChairTypeService chairTypeService;

    @PostMapping("/create-chair-type")
    public ResponseEntity createChairType(@RequestBody ChairType chairType) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/update-chair-type")
    public ResponseEntity updateChairType(@RequestBody ChairType chairType) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/get-chair-type-by-condition")
    public ResponseEntity getChairTypeByCondition(@RequestBody ChairType chairType) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/delete-chair-type")
    public ResponseEntity deleteChairType(@RequestBody ChairType chairType) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
