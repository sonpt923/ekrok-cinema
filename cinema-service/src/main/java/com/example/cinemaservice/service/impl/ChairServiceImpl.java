package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.entity.Chair;
import com.example.cinemaservice.repository.ChairRepository;
import com.example.cinemaservice.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChairServiceImpl implements ChairService {

    @Autowired
    private ChairRepository chairRepository;

    @Override
    public void createListChair(List<Chair> listChair) {

    }
}
