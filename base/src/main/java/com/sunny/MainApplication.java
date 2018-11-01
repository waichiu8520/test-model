package com.sunny;


import com.sunny.core.initializer.MainApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer {
	public static void main(String[] args){
		SpringApplication springApplication = new SpringApplication(MainApplication.class);
		springApplication.addInitializers(new MainApplicationContextInitializer());
		springApplication.run(args);
	}
}