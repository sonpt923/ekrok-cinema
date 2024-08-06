package com.example.cinemaservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RoomResponse {

    private Integer id;

    private String code;

    private String name;

    private String cinema;

    private String roomType;

    private ChairResponse chair;

    private BigDecimal price;

    private Integer status;

}
