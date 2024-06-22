package com.example.movieservice.service;

import com.example.movieservice.dto.request.PersonRequest;
import com.example.movieservice.dto.response.ListResponse;
import com.example.movieservice.entity.Person;

public interface PersonService {

    Person createPeople(Person request, String token);

    Person updatePeople(Person request, String token);

    ListResponse<Person> getPersonsByCondition(PersonRequest request);

}
