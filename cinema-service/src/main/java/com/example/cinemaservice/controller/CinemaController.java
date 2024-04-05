package com.example.cinemaservice.controller;

import com.example.cinemaservice.model.Department;
import com.example.cinemaservice.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cinema")
public class CinemaController {

    @Autowired
    public DepartmentService service;

    private static final Logger LOGGER = LoggerFactory.getLogger(CinemaController.class);

    @PostMapping("/save")
    public Department saveOrUpdate(@RequestBody Department department) {
        LOGGER.info("save Department: department={}", department);
        return service.saveOrUpdate(department);
    }

    @GetMapping("/get-all")
    public List<Department> getAll() {
        LOGGER.info(service.getAll().toString());
        return service.getAll();
    }

    @GetMapping("/get-one/{id}")
    public Department getOneById(@PathVariable("id") Long id) {
        LOGGER.info("find Department: id={}", id);
        LOGGER.info(service.getOneById(id).toString());
        return service.getOneById(id);
    }

}
