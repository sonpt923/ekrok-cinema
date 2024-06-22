package com.example.movieservice.service.impl;

import com.example.movieservice.dto.request.MovieRequest;
import com.example.movieservice.dto.response.ListResponse;
import com.example.movieservice.dto.response.MovieResponse;
import com.example.movieservice.entity.Movie;
import com.example.movieservice.repository.MovieRepository;
import com.example.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie createMovie(MovieRequest movieRequest, String token) {
        return null;
    }

    @Override
    public Movie updateMovie(MovieRequest movieRequest, String token) {
        return null;
    }

    @Override
    public ListResponse<MovieResponse> getMovieBycondition(MovieRequest request) {
        return null;
    }
}
