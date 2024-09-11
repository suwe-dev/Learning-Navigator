package com.example.lms.controllers;

import com.example.lms.entities.ExamEntity;
import com.example.lms.service.ExamService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExamController {

    private ExamService examService;

    @PostMapping("/exams/{examId}/{studentId}")
    public ExamEntity enrollForExam(@PathVariable Long examId, @PathVariable Long studentId) {
        return new ExamEntity();
    }

    @PatchMapping("/exams/{examId}/{studentId}")
    public ExamEntity updateExam(@PathVariable Long examId, @PathVariable Long studentId) {
        return new ExamEntity();
    }

}
