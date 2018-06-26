package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @RequestMapping(value = "/choose")
    public ServiceInstance tesLoadBalance(){

        ServiceInstance serviceInstance = loadBalancerClient.choose("EUREKA-CLIENT");
        System.out.println(serviceInstance.getHost()+serviceInstance.getPort());

        return serviceInstance;
    }
}
