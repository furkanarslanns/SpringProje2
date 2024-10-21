package com.furkanarslan.controller;

import com.furkanarslan.entites.Student;

import java.util.List;

public interface IStudentController  {

public Student saveStudent(Student student);

public List<Student> getStudents();


}
