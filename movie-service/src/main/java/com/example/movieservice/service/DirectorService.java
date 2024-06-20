package com.example.movieservice.service;

import com.example.movieservice.dto.request.DirectorRequest;
import com.example.movieservice.entity.Director;

public interface DirectorService {

    Director createDirector(DirectorRequest request, String username);

}
