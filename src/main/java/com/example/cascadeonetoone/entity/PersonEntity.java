package com.example.cascadeonetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PersonEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long personId;
    private String firstName;
    private String lastName;


    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="address_id")
    private AddressEntity address;

}
