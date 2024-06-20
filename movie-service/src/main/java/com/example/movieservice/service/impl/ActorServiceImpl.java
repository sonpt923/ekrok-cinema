package com.example.movieservice.service.impl;

import com.example.movieservice.dto.request.ActorRequest;
import com.example.movieservice.entity.Actor;
import com.example.movieservice.repository.ActorRepository;
import com.example.movieservice.service.ActorService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    @Transactional
    public Actor createActor(ActorRequest request, String username) {
        return null;
    }

    @Override
    @Transactional
    public Actor updateActor(ActorRequest request, String username) {
        Actor actor = Actor.builder()
                .code(request.getCode())
                .name(request.getName())
                .image(request.getImage())
                .updatedTime(null)
                .updatedBy(username)
                .build();
        return actorRepository.save(actor);
    }
}
