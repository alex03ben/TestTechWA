package com.testTechWA.TestTechWA;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.testTechWA.TestTechWA.Repository.PersonneRepository;


public class ServletInitializer extends SpringBootServletInitializer {
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TestTechWaApplication.class);
	}

}
