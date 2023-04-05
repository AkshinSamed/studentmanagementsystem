package com.sms.studentmanagementsystem.controller;

import com.sms.studentmanagementsystem.service.StudentService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class StudentController {

    private StudentService studentService;

    // Autowiring using constructor
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    // Handler method for handling list students and return model-view
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
}
