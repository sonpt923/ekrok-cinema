package com.example.cinemaservice.service;

import com.example.cinemaservice.dto.request.RoomRequest;

public interface RoomService {

    Object updateRoom(RoomRequest request);

    Object createRoome(RoomRequest request);

    Object getRoomByCondition(RoomRequest request);

    Object getRoom(RoomRequest request);

}
