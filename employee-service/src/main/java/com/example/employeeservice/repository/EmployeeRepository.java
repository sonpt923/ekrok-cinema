package com.example.employeeservice.repository;

import com.example.employeeservice.modal.Department;
import com.example.employeeservice.modal.Employeee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employeee, Long> {

    List<Employeee> findByDepartment(Department department);

}
