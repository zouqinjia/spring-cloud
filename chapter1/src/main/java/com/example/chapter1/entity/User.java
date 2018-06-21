package com.example.chapter1.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class User {


    @Id
    @Column(name="id", unique=true, nullable=false, insertable=true, updatable=false, precision=20, scale=0)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private BigDecimal balance;



}
