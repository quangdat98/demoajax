package com.example.demoajax.service;

import com.example.demoajax.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getList();

    void xoa(int id);

    Student findStudent(int id);

    Boolean updateStudent(Student student);
}
