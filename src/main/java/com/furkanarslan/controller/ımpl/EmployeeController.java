package com.furkanarslan.controller.ımpl;

import com.furkanarslan.controller.IEmployeeController;
import com.furkanarslan.dto.DtoEmployee;
import com.furkanarslan.services.impl.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeController implements IEmployeeController {
@Autowired
EmployeeServices employeeServices;


@GetMapping(path = "/list")
    @Override
    public List<DtoEmployee> getAllEmployees() {
        return employeeServices.getAllEmployees();
    }
}
