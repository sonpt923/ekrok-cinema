package com.example.movieservice.service.impl;

import com.example.movieservice.dto.request.DirectorRequest;
import com.example.movieservice.entity.Director;
import com.example.movieservice.service.ActorService;
import com.example.movieservice.service.DirectorService;
import org.springframework.stereotype.Service;

@Service
public class DirectorServiceImpl implements DirectorService {

    @Override
    public Director createDirector(DirectorRequest request, String username) {
        return null;
    }

}
