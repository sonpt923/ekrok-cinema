package com.example.movieservice.service.impl;

import com.example.movieservice.entity.MovieRole;
import com.example.movieservice.repository.MovieRoleRepository;
import com.example.movieservice.service.MovieRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRoleServiceImpl implements MovieRolesService {

    @Autowired
    private MovieRoleRepository movieRoleRepository;

    @Override
    public List<MovieRole> createBatchMovieRole(List<MovieRole> listMovieRole) {
        return movieRoleRepository.saveAll(listMovieRole);
    }

    @Override
    public List<MovieRole> updateBatchMovieRole(List<MovieRole> listMovieRole) {
        return List.of();
    }

}
