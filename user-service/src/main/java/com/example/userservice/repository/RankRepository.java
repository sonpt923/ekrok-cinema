package com.example.userservice.repository;

import com.example.userservice.entity.Ranks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankRepository extends JpaRepository<Ranks, Long> {
}
