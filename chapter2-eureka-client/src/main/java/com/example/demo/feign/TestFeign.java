package com.example.demo.feign;

import com.example.demo.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "eureka-client")
public interface TestFeign  {

    @RequestMapping(method = RequestMethod.GET,value = "/user/{userId}")
    User getUserById(@PathVariable("userId") Long userId);



}
