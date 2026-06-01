package com.example.spring_exception.Repository;

import com.example.spring_exception.Model.Entity.Student;
import com.example.spring_exception.Model.Request.StudentRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentRepository {
    @Result(property = "id",column = "id")
    @Select("""
    select * from students;
    """)
    List<Student> getAllStudents();
    @Result(property = "id",column = "id")
    @Select("""
INSERT INTO students (name, score)
VALUES (#{name}, #{score})
RETURNING *
""")
    Student CreateNewStudent(StudentRequest studentRequest);


}
