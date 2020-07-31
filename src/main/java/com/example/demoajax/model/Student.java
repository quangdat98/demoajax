package com.example.demoajax.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {

    @Id
    private int id;
    private String name;
    private String old;

    @Column(name = "classname")
    private String classname;

    public Student(int id, String name, String old, String classname) {
        this.id = id;
        this.name = name;
        this.old = old;
        this.classname = classname;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
