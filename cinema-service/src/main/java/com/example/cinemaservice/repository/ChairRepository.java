package com.example.cinemaservice.repository;

import com.example.cinemaservice.entity.Chair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChairRepository extends JpaRepository<Chair, Long> {

    @Query(value = "SELECT chair FROM Chair chair")
    List<Chair> findChairByRoom();

}
