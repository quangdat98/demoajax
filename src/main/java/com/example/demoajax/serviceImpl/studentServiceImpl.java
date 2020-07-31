package com.example.demoajax.serviceImpl;

import com.example.demoajax.model.Student;
import com.example.demoajax.repository.StudentRepository;
import com.example.demoajax.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImpl implements StudentService {
    public StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getList() {
        return studentRepository.findAll();
    }

    @Override
    public void xoa(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findStudent(int id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public Boolean updateStudent(Student student) {
         studentRepository.save(student);
         return true;
    }
}
