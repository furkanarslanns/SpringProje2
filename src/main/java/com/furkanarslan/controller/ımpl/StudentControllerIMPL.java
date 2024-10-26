package com.furkanarslan.controller.ımpl;

import com.furkanarslan.controller.IStudentController;
import com.furkanarslan.dto.DtoStudent;
import com.furkanarslan.dto.DtoStudentUI;
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
    public DtoStudent saveStudent(@RequestBody DtoStudentUI dtoStudentUI) {

    return studentServices.saveStudent(dtoStudentUI);
    }
    @GetMapping(path = "/list")
    @Override
    public List<DtoStudent> getStudents() {
        return studentServices.getAllStudents();
    }
@GetMapping(path = "/list/{id}")
    @Override
    public DtoStudent getStudentbyId(@PathVariable(name = "id")  int id) {
        return studentServices.getStudentById(id);
    }
@DeleteMapping(path = "delete/{id}")
    @Override
    public Student deleteStudent(@PathVariable(name = "id")   int id) {
        studentServices.deleteStudentById(id);
    return null;
}




    @PutMapping(path = "/update/{id}")
@Override
public DtoStudent updateStudent(@PathVariable(name = "id") int id, @RequestBody DtoStudentUI dtoStudentUI) {
        return studentServices.updateStudent(id , dtoStudentUI);
    }
}
