package com.example.demoajax.repository;

import com.example.demoajax.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    void deleteById(int id);

    Student findStudentById(int id);
}
