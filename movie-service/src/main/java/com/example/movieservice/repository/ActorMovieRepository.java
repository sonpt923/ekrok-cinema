package com.example.movieservice.repository;

import com.example.movieservice.entity.ActorMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorMovieRepository extends JpaRepository<ActorMovie, Long> {
}
