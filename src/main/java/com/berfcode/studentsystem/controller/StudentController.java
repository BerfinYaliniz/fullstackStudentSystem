package com.berfcode.studentsystem.controller;

import com.berfcode.studentsystem.model.Student;
import com.berfcode.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable("id") int id) {
        studentService.deleteById(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody Student student) {
        studentService.update(student);
        return "updated student";
    }
    @GetMapping("get/{id}")
    public Optional<Student> findById(@PathVariable int id) {
        return studentService.findById(id);
    }


}
