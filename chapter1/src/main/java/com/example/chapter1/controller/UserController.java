package com.example.chapter1.controller;


import com.example.chapter1.entity.User;
import com.example.chapter1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){

        return userRepository.findOne(userId);

    }
}
