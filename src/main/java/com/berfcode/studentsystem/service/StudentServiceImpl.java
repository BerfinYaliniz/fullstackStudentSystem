package com.berfcode.studentsystem.service;

import com.berfcode.studentsystem.model.Student;
import com.berfcode.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student update(Student student) {
        Student st = studentRepository.findById(student.getId()).get();
        st.setName(student.getName());
        st.setAddress(student.getAddress());
        return studentRepository.save(st);
    }
    @Override
    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }

}
