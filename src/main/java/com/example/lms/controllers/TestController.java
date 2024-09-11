package com.example.lms.controllers;

import com.example.lms.dto.TestDto;
import com.example.lms.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public TestDto testHello() {
        return new TestDto("It's working...");
    }

}
