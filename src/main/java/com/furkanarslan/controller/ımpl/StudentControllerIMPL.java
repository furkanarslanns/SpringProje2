package com.furkanarslan.controller.ımpl;

import com.furkanarslan.controller.IStudentController;
import com.furkanarslan.entites.Student;
import com.furkanarslan.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerIMPL implements IStudentController {
@Autowired
    private IStudentServices studentServices;


@PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentServices.saveStudent(student);
    }
    @GetMapping(path = "/list")
    @Override
    public List<Student> getStudents() {
        return studentServices.getAllStudents();
    }
}
