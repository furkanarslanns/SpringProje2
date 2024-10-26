package com.furkanarslan.controller;

import com.furkanarslan.dto.DtoStudent;
import com.furkanarslan.dto.DtoStudentUI;
import com.furkanarslan.entites.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IStudentController  {

public DtoStudent saveStudent(DtoStudentUI dtoStudentUI);

public List<DtoStudent> getStudents();
public DtoStudent getStudentbyId(int id);
public Student deleteStudent(int id);
public DtoStudent updateStudent(int id ,  DtoStudentUI dtoStudentUI);




}


