package com.example.cinemaservice.service;

import com.example.cinemaservice.dto.request.RoomRequest;

public interface RoomService {

    Object updateRoom(RoomRequest request, String username);

    Object createRoome(RoomRequest request, String username);

    Object getRoomByCondition(RoomRequest request, String username);

}
