package com.example.lms.controllers;

import com.example.lms.entities.StudentEntity;
import com.example.lms.entities.SubjectEntity;
import com.example.lms.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping
    public List<StudentEntity> findAllUsers() {
        return studentService.findAll();
    }

    @PostMapping()
    public StudentEntity saveUser(@RequestBody StudentEntity student) {
        return studentService.saveUser(student);
    }

    @GetMapping("/{id}")
    public Optional<StudentEntity> findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

//     -----------------------------------------------------------------
    @PostMapping("/enroll/subject/{student_id}/{subject_id}")
    public ResponseEntity<?> enrollSubject(@PathVariable Long student_id,
                                           @PathVariable Long subject_id) {
        studentService.enrollSubject(student_id, subject_id);
        return ResponseEntity.ok("Enrolled for the subject");
    }

    @PostMapping("/register/exam/{student_id}/{exam_id}")
    public ResponseEntity<?> registerExam(@PathVariable Long student_id,
                                          @PathVariable Long exam_id) {
        studentService.registerExam(student_id, exam_id);
        return ResponseEntity.ok("Registered for the exam");
    }
}
