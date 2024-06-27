package com.example.movieservice.service.impl;

import com.example.movieservice.entity.MovieGenre;
import com.example.movieservice.service.MovieGenreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieGenreServiceImpl implements MovieGenreService {
    @Override
    public List<MovieGenre> createBatchMovieGenre(List<MovieGenre> listMovieGenre) {
        return List.of();
    }

    @Override
    public List<MovieGenre> updateBatchMovieGenre(List<MovieGenre> listMovieGenre) {
        return List.of();
    }
}
