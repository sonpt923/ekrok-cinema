package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/public")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "this is test messsage";
    }

}
