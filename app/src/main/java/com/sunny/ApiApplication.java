package com.sunny;

import com.sunny.core.initializer.MainApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiApplication extends SpringBootServletInitializer {
    public static void main(String[] args){
        SpringApplication springApplication = new SpringApplication(ApiApplication.class);
        springApplication.addInitializers(new MainApplicationContextInitializer());
        springApplication.run(args);
    }
}