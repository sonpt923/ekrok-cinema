package com.example.userservice.repository;

import com.example.userservice.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissoinRepository extends JpaRepository<Permission, Long> {
}
