package com.furkanarslan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentUI {



    private String FirstName;
    private String lastName;
    private Date birthDate;



}
