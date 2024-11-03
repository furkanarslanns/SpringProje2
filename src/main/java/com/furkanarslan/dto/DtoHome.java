package com.furkanarslan.dto;

import com.furkanarslan.entites.Room;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoHome {

    private Long id;

    private BigDecimal price;


    private List<DtoRoom> room;

}
