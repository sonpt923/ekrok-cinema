package com.example.departmentservice.service;

import com.example.departmentservice.model.Department;

import java.util.List;

public interface DepartmentService {

    Department getOneById(Long id);

    List<Department> getAll();

    Department saveOrUpdate(Department department);

}
