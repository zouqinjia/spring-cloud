package com.example.demo.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zouqinjia
 * Description:
 * Date:2017/10/11 16:13
 **/
@RestController
public class TestController {


    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld() {

        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        String host = serviceInstance.getHost();
        String serviceId = serviceInstance.getServiceId();
        System.out.println("LocalServiceInstance's host is " + host + " and serviceId is " + serviceId);

        return "helloWorld";
    }

}
