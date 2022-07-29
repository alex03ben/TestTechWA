package com.testTechWA.TestTechWA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TestTechWaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTechWaApplication.class, args);
	}

}
