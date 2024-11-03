package com.furkanarslan.controller;

import com.furkanarslan.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DtoEmployee> getAllEmployees();
}
