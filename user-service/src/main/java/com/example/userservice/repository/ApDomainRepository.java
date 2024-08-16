package com.example.userservice.repository;

import com.example.userservice.entity.ApDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ApDomainRepository extends JpaRepository<ApDomain, Long> {

    @Query(value = "SELECT * FROM apdomain ap WHERE ap.parent_code = :code ", nativeQuery = true)
    List<ApDomain> getByParentCode(@Param("code") String parentCode);

    @Query(value = "SELECT ap FROM apdomain ap WHERE ap.code = :code", nativeQuery = true)
    ApDomain getByCode(@Param("code") String code);
}
