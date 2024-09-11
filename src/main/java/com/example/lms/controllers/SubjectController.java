package com.example.lms.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
    @PostMapping("/subject/{subjectId}/{studentId}")
    public String registerSubjects(@PathVariable Long subjectId, @PathVariable Long studentId) {
        return "";
    }
}
