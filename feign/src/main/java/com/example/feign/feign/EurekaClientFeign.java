package com.example.feign.feign;

import com.example.feign.entity.User;
import lombok.experimental.FieldDefaults;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.Map;

@FeignClient(name = "eureka-client")
public interface EurekaClientFeign {

    @RequestMapping(value = "/user/{userId}",method = RequestMethod.GET)
    User getUserById(@PathVariable(name = "userId") Long userId);

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    User getUser(@RequestParam("id") Long id);

    @RequestMapping(value = "user/map",method = RequestMethod.GET)
    User getUserByMap(@RequestParam Map<String,Object> map);

    @RequestMapping(value = "user/add/",method = RequestMethod.POST)
    User addUser(@RequestBody User user);

}
