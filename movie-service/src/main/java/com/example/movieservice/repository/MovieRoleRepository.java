package com.example.movieservice.repository;

import com.example.movieservice.entity.MovieRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRoleRepository extends JpaRepository<MovieRole, Long> {
}
