package com.wayn.learn.springcloud.config.client3366;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3366 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3366.class);
    }

}
