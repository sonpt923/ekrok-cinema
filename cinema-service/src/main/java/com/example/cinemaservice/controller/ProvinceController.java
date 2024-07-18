package com.example.cinemaservice.controller;

import com.example.cinemaservice.entity.Province;
import com.example.cinemaservice.service.ProvinceService;
import com.example.config.EnableWrapResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/province")
@EnableWrapResponse
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @PostMapping(value = "/create-province")
    public ResponseEntity createProvince(@RequestBody Province province, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(provinceService.createProvice(province), HttpStatus.OK);
    }

    @PostMapping("/update-province")
    public ResponseEntity updateProvince(@RequestBody Province province, @RequestHeader("Authorization") String token) {
        return new ResponseEntity(provinceService.updateProvice(province), HttpStatus.OK);
    }

    @PostMapping("/get-province-by-condition")
    public ResponseEntity getProvinceByCondition(@RequestBody Province province) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

}
