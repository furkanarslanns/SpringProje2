package com.furkanarslan.controller;

import com.furkanarslan.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);


}
