package com.furkanarslan.services.impl;

import com.furkanarslan.dto.DtoEmployee;
import com.furkanarslan.entites.Employee;
import com.furkanarslan.repository.EmployeeRepository;
import com.furkanarslan.services.IEmployeeServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServices implements IEmployeeServices {
@Autowired
EmployeeRepository employeeRepository;


    @Override
    public List<DtoEmployee> getAllEmployees() {
      List<DtoEmployee> dtoEmployees = new ArrayList<>();
       List<Employee> employeesList = employeeRepository.findAll();

       if (!employeesList.isEmpty()) {
           for (Employee employee : employeesList) {
               DtoEmployee dtoEmployee = new DtoEmployee();
               BeanUtils.copyProperties(employee, dtoEmployee);
               dtoEmployee.setDepartman(employee.getDepartman());

         dtoEmployees.add(dtoEmployee);
           }
       }






        return dtoEmployees;
    }
}
