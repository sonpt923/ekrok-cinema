package com.example.movieservice.service;

import com.example.movieservice.dto.request.ActorRequest;
import com.example.movieservice.entity.Actor;

public interface ActorService {

    Actor createActor(ActorRequest request, String username);

    Actor updateActor(ActorRequest request, String username);

}
