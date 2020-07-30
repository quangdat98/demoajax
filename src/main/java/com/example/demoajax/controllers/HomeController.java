package com.example.demoajax.controllers;

import com.example.demoajax.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService){this.studentService= studentService;}

    @RequestMapping(value = "/")
    public String getindex(){
        return "index";
    }
    @GetMapping("/xoa")
    public String xoa(@RequestParam int id){
        studentService.xoa(id);
        return "redirect:/";
    }
    @GetMapping("sua/{id}")
    public String sua(@PathVariable int id, Model model){
        model.addAttribute("student",studentService.findStudent(id));
        return "trangsua";
    }
}
