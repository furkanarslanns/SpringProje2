package com.furkanarslan.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name = "customer")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
@Column(name = "name")
    private String name;


@OneToOne
private Address address;
}
