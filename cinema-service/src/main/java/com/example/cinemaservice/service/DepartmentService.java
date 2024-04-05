package com.example.cinemaservice.service;

import com.example.cinemaservice.model.Department;

import java.util.List;

public interface DepartmentService {

    Department getOneById(Long id);

    List<Department> getAll();

    Department saveOrUpdate(Department department);

}
