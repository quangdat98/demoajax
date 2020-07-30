package com.example.demoajax.controllers;

import com.example.demoajax.model.Student;
import com.example.demoajax.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controllerRest {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService){this.studentService= studentService;}

    @GetMapping("/getlist")
    public List<Student> getlist(){
        System.out.println("da vao day chua");
        return studentService.getList();
    }

    @PostMapping("/getsua")
    public Student getSudent(@ModelAttribute Student student){
        Student getStudentUpdate = studentService.updateStudent(student);
        return getStudentUpdate;
    }

}
