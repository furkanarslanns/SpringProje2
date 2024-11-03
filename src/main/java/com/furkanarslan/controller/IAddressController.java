package com.furkanarslan.controller;

import com.furkanarslan.dto.DtoAddress;

public interface IAddressController {
    public DtoAddress findAddressById(Long id);
}
