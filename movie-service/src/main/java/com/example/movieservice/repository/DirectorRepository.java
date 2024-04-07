package com.example.movieservice.repository;

import com.example.movieservice.entity.Actor;
import com.example.movieservice.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {
}
