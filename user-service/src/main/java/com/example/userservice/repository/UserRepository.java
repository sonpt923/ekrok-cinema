package com.example.userservice.repository;

import com.example.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT u FROM User u WHERE u.code = :code ")
    User getUserByCode(@Param("code") String code);

    @Query(value = "SELECT u FROM User u WHERE u.code = :code AND u.status = :status")
    User getUserByCodeAndStatus(@Param("code") String code, @Param("status") long status);

    Boolean existsByCode(String code);

}
