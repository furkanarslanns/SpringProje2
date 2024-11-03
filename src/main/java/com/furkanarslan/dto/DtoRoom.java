package com.furkanarslan.dto;

import com.furkanarslan.entites.Room;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoRoom  {

    private Long id;

    private String name;
}
