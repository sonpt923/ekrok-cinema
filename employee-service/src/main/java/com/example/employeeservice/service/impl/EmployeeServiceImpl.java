package com.example.employeeservice.service.impl;

import com.example.employeeservice.modal.Department;
import com.example.employeeservice.modal.Employeee;
import com.example.employeeservice.repository.EmployeeRepository;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EmployeeRepository repository;

    private static final String DEPARTMENTURL = "http://localhost:8081/department/get-one/";

    @Override
    public Employeee saveOrUpdate(Employeee employeee) {
        return repository.save(employeee);
    }

    @Override
    public List<Employeee> getAll() {
        return repository.findAll();
    }

    @Override
    public Employeee getOneById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Object getDepartmentById(Long id) {
        Object department = restTemplate.exchange(DEPARTMENTURL + id, HttpMethod.GET, null, Object.class);
        return department;
    }

}
