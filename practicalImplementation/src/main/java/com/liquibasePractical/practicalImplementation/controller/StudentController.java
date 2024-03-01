package com.liquibasePractical.practicalImplementation.controller;

import com.liquibasePractical.practicalImplementation.entity.Student;
import com.liquibasePractical.practicalImplementation.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        this.studentRepo.save(student);
        return "Student added Successfully";
    }

    @GetMapping("/get")
    public List<Student> get() {
        return this.studentRepo.findAll();
    }


}
