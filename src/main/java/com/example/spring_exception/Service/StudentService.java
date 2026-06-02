package com.example.spring_exception.Service;

import com.example.spring_exception.Model.Entity.Student;
import com.example.spring_exception.Model.Request.StudentRequest;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student CreateNewStudent(StudentRequest studentRequest);

    List<Student> getStudentById(Long id);

    Student deleteStudentById(Long id);
}
