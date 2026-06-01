package com.example.spring_exception.controller;

import com.example.spring_exception.Model.Entity.Student;
import com.example.spring_exception.Model.Response.ApiResponse;
import com.example.spring_exception.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.json.JsonMapper;
import java.time.Instant;
import java.util.List;
@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    public final StudentService studentService;
    private final JsonMapper.Builder builder;
    @GetMapping("/{allstudent}")
    public ResponseEntity<?> getAllStudents(){
        List<Student> students=studentService.getAllStudents();
        ApiResponse<List<Student>> response =ApiResponse.<List<Student>>builder().
                message("Successfully").
                status(HttpStatus.OK).
                localtime(Instant.now()).
                payload(students).build();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    @PostMapping
    public ResponseEntity<?> createNewStudent(){
       List<Student> postStudent = studentService.CreateNewStudent();
        return null;
    }
}
