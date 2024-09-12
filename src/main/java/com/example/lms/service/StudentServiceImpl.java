package com.example.lms.service;

import com.example.lms.entities.ExamEntity;
import com.example.lms.entities.StudentEntity;
import com.example.lms.entities.SubjectEntity;
import com.example.lms.exception.ResourceNotFoundException;
import com.example.lms.repository.ExamRepository;
import com.example.lms.repository.StudentRepository;
import com.example.lms.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private ExamRepository examRepository;

    @Override
    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity saveUser(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<StudentEntity> findById(Long student_id) {
        return studentRepository.findById(student_id);
    }

    @Override
    public void enrollSubject(Long student_id, Long subject_id) {
        StudentEntity student = studentRepository.findById(student_id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        System.out.println("BEFORE - Student Entity: " + student.toString());

        SubjectEntity subject = subjectRepository.findById(subject_id)
                .orElseThrow(() -> new ResourceNotFoundException("Subject not found"));
        System.out.println("Subject Entity: " + subject.toString());

        student.getEnrolledSubjects().add(subject);
        System.out.println("AFTER - Student Entity: " + student.toString());
        studentRepository.save(student);
    }

    @Override
    public void registerExam(Long student_id, Long exam_id) {
        StudentEntity student = studentRepository.findById(student_id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        System.out.println("BEFORE - Student Entity: " + student.toString());
        ExamEntity exam = examRepository.findById(exam_id)
                .orElseThrow(() -> new ResourceNotFoundException("Exam not found"));
        System.out.println("Exam Entity: " + exam.toString());
        if (!student.getEnrolledSubjects().contains(exam.getSubject())) {
            throw new ResourceNotFoundException("Student must be enrolled in the subject to register for the exam");
        }

        student.getRegisteredExams().add(exam);
        System.out.println("AFTER - Student Entity: " + student.toString());
        studentRepository.save(student);
    }

}
