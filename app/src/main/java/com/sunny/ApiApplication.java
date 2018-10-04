package com.sunny;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiApplication extends SpringBootServletInitializer {
    public static void main(String[] args){
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder();
        springApplicationBuilder.sources(ApiApplication.class);
        //springApplicationBuilder.
        //springApplicationBuilder.profiles("application.properties");
        springApplicationBuilder.run(args);
    }
}