package com.example.movieservice.service;

import com.example.movieservice.dto.request.PeopleRequest;
import com.example.movieservice.entity.People;

public interface PeopleService {

    People createPeople(PeopleRequest request, String username);

    People updatePeople(PeopleRequest request, String username);

}
