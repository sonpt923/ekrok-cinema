package com.example.movieservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequest {

    private int page;

    private int pageSize;

    private List<Integer> genres;

    private Integer status;



}
