package com.example.userservice.controller.PublicAPI;

import com.example.config.EnableWrapResponse;
import com.example.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWrapResponse
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/test")
    public String test() {
        return "this is test messsage";
    }

}
