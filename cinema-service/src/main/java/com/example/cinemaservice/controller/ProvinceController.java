package com.example.cinemaservice.controller;

import com.example.cinemaservice.entity.Province;
import com.example.cinemaservice.service.ProvinceService;
import com.example.config.EnableWrapResponse;
import org.apache.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/province")
@EnableWrapResponse
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @PostMapping("/create-province")
    public ResponseEntity createProvince(@RequestBody Province province, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return null;
    }

    @PostMapping("/update-province")
    public ResponseEntity updateProvince(@RequestBody Province province, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return null;
    }

    @PostMapping("/get-province-by-condition")
    public ResponseEntity getProvinceByCondition() {
        return null;
    }


}
