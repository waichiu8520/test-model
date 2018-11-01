package com.sunny;

import com.sunny.core.initializer.MainApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {
	public static void main(String[] args){
		SpringApplication springApplication = new SpringApplication(BackendApplication.class);
		springApplication.addInitializers(new MainApplicationContextInitializer());
		springApplication.run(args);
	}
}
