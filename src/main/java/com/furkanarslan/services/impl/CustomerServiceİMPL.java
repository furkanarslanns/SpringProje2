package com.furkanarslan.services.impl;

import com.furkanarslan.dto.DtoAddress;
import com.furkanarslan.dto.DtoCustomer;
import com.furkanarslan.entites.Address;
import com.furkanarslan.entites.Customer;
import com.furkanarslan.repository.ICustomerRepository;
import com.furkanarslan.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomerServiceİMPL implements ICustomerService {
   @Autowired
    private ICustomerRepository customerRepository;



    @Override
    public DtoCustomer findCustomerByid(long id) {
      DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress = new DtoAddress();

        Optional<Customer> optional= customerRepository.findById(id);
if (optional.isEmpty()){
    return null;
}
Customer customer=optional.get();
        Address address=optional.get().getAddress();
        BeanUtils.copyProperties(customer,dtoCustomer);
        BeanUtils.copyProperties(address,dtoAddress);
        dtoCustomer.setDtoAddress(dtoAddress);
        return null;
    }
}
