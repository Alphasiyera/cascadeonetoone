package com.example.cascadeonetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     private Long addressId;
     private String address1;
     private String address2;
     private String city;
     private String state;
     private Long zipcode;
}
