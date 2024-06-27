package com.example.movieservice.service;

import com.example.movieservice.dto.request.GenreRequest;
import com.example.movieservice.dto.response.ListResponse;
import com.example.movieservice.entity.Genre;

public interface GenreService {

    Genre createGenre(Genre genre, String token);

    Genre updateGenre(Genre genre, String token);

    ListResponse<Genre> getGenreByCondtion(GenreRequest genreRequest);

}
