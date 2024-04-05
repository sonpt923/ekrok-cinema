package com.example.employeeservice.service;

import com.example.employeeservice.modal.Department;
import com.example.employeeservice.modal.Employeee;

import java.util.List;

public interface EmployeeService {

    Employeee saveOrUpdate(Employeee employeee);

    List<Employeee> getAll();

    Employeee getOneById(Long id);

    Object getDepartmentById(Long id);

}
