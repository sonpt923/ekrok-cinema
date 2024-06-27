package com.example.movieservice.service;

import com.example.movieservice.entity.MovieRole;

import java.util.List;

public interface MovieRolesService {

    List<MovieRole> createBatchMovieRole(List<MovieRole> listMovieRole);

    List<MovieRole> updateBatchMovieRole(List<MovieRole> listMovieRole);

}
