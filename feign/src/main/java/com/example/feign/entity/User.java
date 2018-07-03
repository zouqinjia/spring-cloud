package com.example.feign.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
public class User {



    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;



}
