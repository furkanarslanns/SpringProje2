package com.furkanarslan.controller;

import com.furkanarslan.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(long id);
}
