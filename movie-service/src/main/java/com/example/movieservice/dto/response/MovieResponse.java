package com.example.movieservice.dto.response;

import com.example.movieservice.entity.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieResponse {

    private int id;

    private String code;

    private Integer ageRestriction;

    private Integer duration;

    private String poster;

    private String trailer;

    private Date premiereDate;

    private String title;

    private List<Map<String, String>> backDrops;

    private Genre genre;


}
