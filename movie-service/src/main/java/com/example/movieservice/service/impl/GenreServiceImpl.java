package com.example.movieservice.service.impl;

import com.example.movieservice.entity.Genre;
import com.example.movieservice.repository.GenreRepository;
import com.example.movieservice.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public Genre createGenre(Genre genre, String token) {
        return null;
    }

    @Override
    public Genre updateGenre(Genre genre, String token) {
        return null;
    }
}
