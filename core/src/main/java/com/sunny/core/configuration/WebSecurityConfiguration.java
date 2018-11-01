package com.sunny.core.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Value("${spring.security.csrf.enable}")
	private boolean enableCsrf;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		if(!enableCsrf){
			http.csrf().disable();
		}



		//http.authorizeRequests().anyRequest().hasIpAddress("127.0.0.1/32");
	}
}
