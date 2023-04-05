package com.sms.studentmanagementsystem.service.implement;

import com.sms.studentmanagementsystem.entity.Student;
import com.sms.studentmanagementsystem.repository.StudentRepository;
import com.sms.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplement implements StudentService {

    private StudentRepository studentRepository;

    // Autowiring with constructor
    public StudentServiceImplement(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
