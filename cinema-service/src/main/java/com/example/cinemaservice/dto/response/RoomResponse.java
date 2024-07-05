package com.example.cinemaservice.dto.response;

import com.example.cinemaservice.entity.Chair;
import com.example.cinemaservice.entity.RoomType;

import java.math.BigDecimal;

public interface RoomResponse {

    Long getId();

    String getCode();

    String getName();

    String getCinema();

    RoomType getRoomType();

    Chair getChair();

    BigDecimal getPrice();

    Long getStatus();

    String getCreatedAt();

    String getCreatedBy();

    String getUpdatedAt();

    String getUpdatedBy();

}
