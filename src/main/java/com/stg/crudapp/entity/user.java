package com.stg.crudapp.entity;

import jakarta.persistence.*;
import jakarta.persistence.metamodel.IdentifiableType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email_id")
     private String emailId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;


}
