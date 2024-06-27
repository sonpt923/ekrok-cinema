package com.example.movieservice.service.impl;

import com.example.dto.common.MessageResponseDTO;
import com.example.movieservice.dto.request.MovieRequest;
import com.example.movieservice.dto.request.PersonRequest;
import com.example.movieservice.dto.response.ListResponse;
import com.example.movieservice.dto.response.MovieResponse;
import com.example.movieservice.entity.*;
import com.example.movieservice.repository.MovieRepository;
import com.example.movieservice.service.MovieGenreService;
import com.example.movieservice.service.MovieService;
import com.example.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieGenreService movieGenreService;

    @Override
    public Object createMovie(MovieRequest movieRequest, String token) {
        validateCreate(movieRequest);
        String code = movieRequest.getCode();
        if (StringUtil.stringIsNullOrEmty(code)) {
            code = StringUtil.generateString(9);
        }
        Movie movie = Movie.builder()
                .title(movieRequest.getTitle())
                .code(code)
                .releaseDate((Date) movieRequest.getReleaseDate())
                .duration(movieRequest.getDuration())
                .ageRestriction(movieRequest.getAgeRestriction())
                .build();
        if (StringUtil.stringIsNullOrEmty(movie)) {
            List<MovieGenre> listMovieGenre = new ArrayList<>();
            for (Genre genre : movieRequest.getGenres()) {
                MovieGenre movieGenre = new MovieGenre();
                movieGenre.setMovie(movie);
                movieGenre.setGenre(genre);
                listMovieGenre.add(movieGenre);
            }
            movieGenreService.createBatchMovieGenre(listMovieGenre);

            List<MovieRole> listMovieRole = new ArrayList<>();
            for (PersonRequest personRequest : movieRequest.getPersons()) {
                MovieRole movieRole = new MovieRole();
                movieRole.setPerson(Person.builder().id(personRequest.getId()).build());
                movieRole.setMovieId(movie);
                movieRole.setRole(personRequest.getRole());
            }

            return new MessageResponseDTO<>(200, "", "", "", "");

        }
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

    private void validateCreate(MovieRequest movieRequest) {

    }
}
