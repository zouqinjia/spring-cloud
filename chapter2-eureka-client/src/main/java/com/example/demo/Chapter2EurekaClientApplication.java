package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @EnableEurekaClient 注解替代@EnableDiscoveryClient.在Spring Cloud中，
 * 服务发现组件有多种选择，例如Zookeeper、Consul等。@EnableDiscoveryClient为各种
 * 服务组件提供了支持，该注解是spring-commons项目中的注解，是一个高度抽象 ;
 * @EnableEurekaClient 表明是Eureka的Client
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Chapter2EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter2EurekaClientApplication.class, args);
    }
}
