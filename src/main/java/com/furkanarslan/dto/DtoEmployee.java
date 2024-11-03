package com.furkanarslan.dto;

import com.furkanarslan.entites.Departman;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoEmployee {
    private long id;

    private String name;


    private Departman departman;


}
