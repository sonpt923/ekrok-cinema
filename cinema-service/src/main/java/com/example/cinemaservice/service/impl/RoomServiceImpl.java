package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.repository.RoomRepository;
import com.example.cinemaservice.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

}
