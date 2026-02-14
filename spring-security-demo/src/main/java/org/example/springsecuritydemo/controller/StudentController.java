package org.example.springsecuritydemo.controller;


import org.example.springsecuritydemo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    List<Student> allStudents = List.of(
            new Student(1,"studnet1"),
            new Student(2,"student2"),
            new Student(3,"student3")
    );

    @GetMapping("/allstudents")
    public List<Student> getAllStudents(){
        return allStudents;
    }
}
