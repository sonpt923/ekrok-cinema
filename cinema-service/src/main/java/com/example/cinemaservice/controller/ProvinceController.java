package com.example.cinemaservice.controller;

import com.example.cinemaservice.entity.Province;
import com.example.cinemaservice.service.ProvinceService;
import com.example.config.EnableWrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cinema")
@EnableWrapResponse
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @PostMapping("/create-province")
    public ResponseEntity createProvince(@RequestBody Province province, @RequestHeader("Authorization") String tokne) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/update-province")
    public ResponseEntity updateProvince(@RequestBody Province province, @RequestHeader("Authorization") String tokne) {
        return null;
    }

    @PostMapping("/get-province-by-condition")
    public ResponseEntity getProvinceByCondition(@RequestBody Province province) {
        return new ResponseEntity(null, HttpStatus.OK);
    }


}
