package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.entity.Chair;
import com.example.cinemaservice.repository.ChairRepository;
import com.example.cinemaservice.service.ChairService;
import com.example.cinemaservice.service.ChairTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChairServiceImpl implements ChairService {

    @Autowired
    private ChairRepository chairRepository;

    @Autowired
    private ChairTypeService chairTypeService;

//    @Autowired
//    private RedisTemplate redisTemplate;

    @Override
    public void createBatchChair(List<Chair> listChair) {

    }

    @Override
    public void udpateChair(Chair chair) {

    }

    @Override
    public Chair getDetailChair(Chair chair) {
        return null;
    }
}
