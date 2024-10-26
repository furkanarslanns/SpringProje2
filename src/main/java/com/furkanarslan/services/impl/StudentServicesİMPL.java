package com.furkanarslan.services.impl;

import com.furkanarslan.dto.DtoStudent;
import com.furkanarslan.dto.DtoStudentUI;
import com.furkanarslan.entites.Student;
import com.furkanarslan.repository.IStudentRepository;
import com.furkanarslan.services.IStudentServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServicesİMPL implements IStudentServices {
@Autowired
private IStudentRepository studentRepository;
    @Override
    public DtoStudent saveStudent(DtoStudentUI dtoStudentIU) {
        DtoStudent response = new DtoStudent();
Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);
        Student dbStudent = studentRepository.save(student);
BeanUtils.copyProperties(dbStudent, response);

        return response;
    }

    @Override
    public List<DtoStudent> getAllStudents() {
        List<DtoStudent> dtolist = new ArrayList<>();
        List<Student> studentList = studentRepository.findAll();
        for (Student student : studentList) {
            DtoStudent dto =new DtoStudent();
            BeanUtils.copyProperties(student,dto);
            dtolist.add(dto);
        }

        return dtolist;




    }

    @Override
    public DtoStudent getStudentById(int id) {
    DtoStudent dto = new DtoStudent();
    Optional<Student> student = studentRepository.findById(id);
    if (student.isPresent()) {
        Student dbStudent = student.get();
        BeanUtils.copyProperties(dbStudent, dto);
    }
    return dto;
    }

    @Override
    public Student deleteStudentById(int id) {
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            studentRepository.delete(optional.get());
        }
return null;
    }

    @Override
    public DtoStudent updateStudent(int id, DtoStudentUI dtoStudentIU) {
DtoStudent dto = new DtoStudent();
        Optional<Student> optional = studentRepository.findById(id);
if (optional.isPresent()) {
    Student dbstudent = optional.get();
    dbstudent.setFirstName(dtoStudentIU.getFirstName());
    dbstudent.setLastName(dtoStudentIU.getLastName());
    dbstudent.setBirthDate(dtoStudentIU.getBirthDate());
    Student student = studentRepository.save(dbstudent);
    BeanUtils.copyProperties(student, dto);
    return dto;
}
return null;


    }


}