package com.example.movieservice.dto.request;

import com.example.movieservice.entity.Genre;
import com.example.movieservice.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequest {

    private String code;

    private int page;

    private int pageSize;

    private List<Genre> genres;

    private List<Person> people;

    private Integer status;


}
