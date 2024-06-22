package com.example.movieservice.service;

import com.example.movieservice.dto.request.MovieRequest;
import com.example.movieservice.dto.response.ListResponse;
import com.example.movieservice.dto.response.MovieResponse;
import com.example.movieservice.entity.Movie;

public interface MovieService {

    Movie createMovie(MovieRequest movieRequest, String token);

    Movie updateMovie(MovieRequest movieRequest, String token);

    ListResponse<MovieResponse> getMovieBycondition(MovieRequest request);

}
