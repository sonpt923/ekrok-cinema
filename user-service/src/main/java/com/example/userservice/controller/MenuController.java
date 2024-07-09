package com.example.userservice.controller;

import com.example.config.EnableWrapResponse;
import com.example.userservice.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/user/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

}
