package com.sunny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args){
        SpringApplication springApplication = new SpringApplication();
        springApplication.run(ApiApplication.class, args);
    }
}