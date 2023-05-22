package com.naprawnikbfr.demo.dao;

import com.naprawnikbfr.demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student getById(Integer id);
    List<Student> getAll();
    List<Student> getByLastName(String lastName);
    void update(Student theStudent);
    Student delete(Integer id);
    int deleteAll();
}
