package com.example.spring_exception.Service.ServiceImp;

import com.example.spring_exception.Model.Entity.Student;
import com.example.spring_exception.Model.Request.StudentRequest;
import com.example.spring_exception.Repository.StudentRepository;
import com.example.spring_exception.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    public final StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public Student CreateNewStudent(StudentRequest studentRequest) {
        return studentRepository.CreateNewStudent(studentRequest);
    }

    @Override
    public List<Student> getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }

    @Override
    public Student deleteStudentById(Long id) {
        return studentRepository.deleteStudentById(id);
    }
}
