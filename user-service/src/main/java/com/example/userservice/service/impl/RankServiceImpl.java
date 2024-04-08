package com.example.userservice.service.impl;

import com.example.userservice.repository.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankServiceImpl {

    @Autowired
    private RankRepository rankRepository;

}
