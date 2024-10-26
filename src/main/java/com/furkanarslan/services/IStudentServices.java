package com.furkanarslan.services;

import com.furkanarslan.dto.DtoStudent;
import com.furkanarslan.dto.DtoStudentUI;
import com.furkanarslan.entites.Student;

import java.util.List;

public interface IStudentServices {

public DtoStudent saveStudent(DtoStudentUI student);

public List<DtoStudent> getAllStudents();

public DtoStudent getStudentById(int id);

public Student deleteStudentById(int id);

public DtoStudent updateStudent(int id, DtoStudentUI dtoStudentUI);


}
