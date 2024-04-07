package com.example.movieservice.repository;

import com.example.movieservice.entity.ProducerMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerMovieRepository extends JpaRepository<ProducerMovie, Long> {
}
