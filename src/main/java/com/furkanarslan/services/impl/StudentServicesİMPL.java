package com.furkanarslan.services.impl;

import com.furkanarslan.entites.Student;
import com.furkanarslan.repository.IStudentRepository;
import com.furkanarslan.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicesİMPL implements IStudentServices {
@Autowired
private IStudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
