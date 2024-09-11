package com.example.lms.controllers;

import com.example.lms.entities.StudentEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    public StudentEntity createStudent(StudentEntity studentEntity) {
        return new StudentEntity();
    }
}
