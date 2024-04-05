package com.example.departmentservice.service.impl;

import com.example.departmentservice.model.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import com.example.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public Department getOneById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Department> getAll() {
        return repository.findAll();
    }

    @Override
    public Department saveOrUpdate(Department department) {
        return repository.save(department);
    }
}
