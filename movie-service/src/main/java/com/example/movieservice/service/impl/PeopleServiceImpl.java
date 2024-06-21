package com.example.movieservice.service.impl;

import com.example.movieservice.dto.request.PeopleRequest;
import com.example.movieservice.entity.People;
import com.example.movieservice.repository.PeopleRepository;
import com.example.movieservice.service.PeopleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    @Transactional
    public People createPeople(PeopleRequest request, String username) {
        return null;
    }

    @Override
    @Transactional
    public People updatePeople(PeopleRequest request, String username) {
        People actor = People.builder()
                .code(request.getCode())
                .name(request.getName())
                .image(request.getImage())
                .updatedTime(null)
                .updatedBy(username)
                .build();
        return peopleRepository.save(actor);
    }
}
