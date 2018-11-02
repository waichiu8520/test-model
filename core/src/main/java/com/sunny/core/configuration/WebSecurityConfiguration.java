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

		http.csrf().disable();

		http.formLogin()
				.loginPage("/**/login");
	}
}
