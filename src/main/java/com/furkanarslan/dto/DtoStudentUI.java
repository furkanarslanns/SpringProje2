package com.furkanarslan.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentUI {


@NotEmpty(message = "first name boş bırakılamaz")
    private String FirstName;

@Size(min = 3,max = 30)
    private String lastName;
    private Date birthDate;



}
