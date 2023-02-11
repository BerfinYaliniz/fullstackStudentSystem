package com.berfcode.studentsystem.service;

import com.berfcode.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

    public void deleteById(int id);
}
