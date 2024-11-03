package com.furkanarslan.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departman")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   @Column(name = "departman_name")
    private String departmanName;


}
