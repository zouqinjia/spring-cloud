package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){

        return userRepository.findOne(userId);

    }


    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getUser(@RequestParam(value = "id") Long id){

        System.out.println("/user id is : "+id);
        return null;
    }

    @RequestMapping(value = "user/map",method = RequestMethod.GET)
    public User getUserByMap(@RequestParam Map<String,Object> map){

        map.forEach((s, o) -> {

            System.out.println("/user/map mao is : "+s);
        });
        return  null;
    }

    @RequestMapping(value = "user/add/",method = RequestMethod.POST)
    public User addUser(@RequestBody User user){

        System.out.println("user/add/ is : " + user.getId());

        return null;
    }
}
