package com.example.movieservice.service.impl;

import com.example.movieservice.dto.request.PersonRequest;
import com.example.movieservice.dto.response.ListResponse;
import com.example.movieservice.entity.Person;
import com.example.movieservice.repository.PeopleRepository;
import com.example.movieservice.service.PersonService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    @Transactional
    public Person createPeople(Person request, String username) {
        request.setCreatedBy(username);
        return peopleRepository.save(request);
    }

    @Override
    @Transactional
    public Person updatePeople(Person request, String username) {
        request.setUpdatedBy(username);
        return peopleRepository.save(request);
    }

    @Override
    public ListResponse<Person> getPersonsByCondition(PersonRequest request) {
        return null;
    }
}
