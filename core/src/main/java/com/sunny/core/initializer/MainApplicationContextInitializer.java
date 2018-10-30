package com.sunny.core.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.ResourcePropertySource;
import properites.Application;

public class MainApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext){
		try {
			loadPropertySources(applicationContext);
		} catch (Exception e) {
			//GeneralLogger.error(this.getClass(), "Error initializing application", e);
		}
	}

	private void loadPropertySources(ConfigurableApplicationContext applicationContext) throws Exception {
		ConfigurableEnvironment configurableEnvironment = applicationContext.getEnvironment();
		for(Application module: Application.values()){
			ClassPathResource classPathResource = new ClassPathResource("application" +
					(module.getValue().length() > 0 ? "-" +module.getValue() : "") + ".properties");
			if(classPathResource.exists()){
				configurableEnvironment.getPropertySources().addLast(new ResourcePropertySource(classPathResource));
			}
			for (String activeProfile : configurableEnvironment.getActiveProfiles()) {
				classPathResource = new ClassPathResource("application" +
						(module.getValue().length() > 0 ? "-" + module.getValue() : "") + "-" + activeProfile + ".properties");
				if (classPathResource.exists()) {
					configurableEnvironment.getPropertySources().addLast(new ResourcePropertySource(classPathResource));
				}
			}
		}
	}

}
