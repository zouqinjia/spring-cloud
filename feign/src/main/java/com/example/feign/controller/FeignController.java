package com.example.feign.controller;

import com.example.demo.feign.TestFeign;
import com.example.feign.entity.User;
import com.example.feign.feign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FeignController {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;



    @GetMapping(value = "/user/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){

        User user = eurekaClientFeign.getUserById(userId);
        eurekaClientFeign.getUser(2L);
        User user1 = new User();
        user1.setId(1222L);
        user1.setName("name");
        user1.setUsername("userName");
        eurekaClientFeign.addUser(user1);
        Map map = new HashMap<>();
        map.put("id","12");
        map.put("username","12333");
        eurekaClientFeign.getUserByMap(map);
        return user;
    }

}
