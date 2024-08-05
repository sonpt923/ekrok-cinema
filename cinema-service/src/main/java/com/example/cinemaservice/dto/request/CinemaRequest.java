package com.example.cinemaservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CinemaRequest {

    private Integer id;

    private String name;

    private String address;

    private Long pronvice;

    private BigDecimal price;


}
