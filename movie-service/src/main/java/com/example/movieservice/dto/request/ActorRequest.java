package com.example.movieservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorRequest {

    private Long id;

    private String code;

    private String image;

    private String name;

    private Integer status;

    private Integer page;

    private Integer pageSize;

}
