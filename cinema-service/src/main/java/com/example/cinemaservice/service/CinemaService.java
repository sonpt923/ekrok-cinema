package com.example.cinemaservice.service;

import com.example.cinemaservice.dto.request.CinemaRequest;

public interface CinemaService {

    Object createCinema(CinemaRequest request);

    Object updateCinema(CinemaRequest request);

}
