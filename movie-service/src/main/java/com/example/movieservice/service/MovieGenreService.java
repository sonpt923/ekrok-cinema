package com.example.movieservice.service;

import com.example.movieservice.entity.MovieGenre;

import java.util.List;

public interface MovieGenreService {

    List<MovieGenre> createBatchMovieGenre(List<MovieGenre> listMovieGenre);

    List<MovieGenre> updateBatchMovieGenre(List<MovieGenre> listMovieGenre);

}
