package com.example.cinemaservice.service.impl;

import com.example.cinemaservice.entity.RoomType;
import com.example.cinemaservice.repository.RoomTypeRepository;
import com.example.cinemaservice.service.RoomTypeService;
import com.example.service.MyDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    @Autowired
    private RoomTypeRepository roomTypeRepository;

    @Autowired
    private MyDictionary dictionary;

    @Override
    public Object createRoomType(RoomType roomType) {
        return null;
    }

    @Override
    public Object updateRoomType(RoomType roomType) {
        return null;
    }

    public void validateRoomType(RoomType roomType) {



    }
}
