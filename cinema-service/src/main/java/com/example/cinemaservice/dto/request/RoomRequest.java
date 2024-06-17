package com.example.cinemaservice.dto.request;

import com.example.cinemaservice.entity.Chair;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomRequest {

    private String name;

    private BigDecimal price;

    private Integer status;

    List<Chair> chairs;

    private Long page;

    private Long pageSize;

}
