package com.furkanarslan.controller.ımpl;

import com.furkanarslan.controller.IAddressController;
import com.furkanarslan.dto.DtoAddress;
import com.furkanarslan.services.impl.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list/api/address")
public class AddressController implements IAddressController {
   @Autowired
   public AddressServices addressServices;
@GetMapping("/list/{id}")
    @Override
    public DtoAddress findAddressById(@PathVariable(name = "id") Long id) {

        return addressServices.findAddressById(id);
    }
}
