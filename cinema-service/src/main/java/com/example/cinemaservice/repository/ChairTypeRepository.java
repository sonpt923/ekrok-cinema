package com.example.cinemaservice.repository;

import com.example.cinemaservice.entity.Chair;
import com.example.cinemaservice.entity.ChairType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChairTypeRepository extends JpaRepository<ChairType, Long> {
}
