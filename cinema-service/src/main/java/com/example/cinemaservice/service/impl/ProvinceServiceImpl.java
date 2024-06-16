package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.repository.ProvinceRepository;
import com.example.cinemaservice.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;




}
