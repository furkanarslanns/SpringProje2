package com.furkanarslan.controller.ımpl;

import com.furkanarslan.controller.ICustomerController;
import com.furkanarslan.dto.DtoCustomer;
import com.furkanarslan.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/rest/api/customer")
public class   CustomerControllerİMPL implements ICustomerController {
@Autowired
private ICustomerService customerService;


@GetMapping(path = "/list/{id}")
    @Override
    public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {
        return customerService.findCustomerByid(id);
    }
}
