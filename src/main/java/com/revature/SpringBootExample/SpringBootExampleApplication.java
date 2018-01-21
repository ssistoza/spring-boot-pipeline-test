package com.revature.SpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExampleApplication {

	/*
	 * Spring Boot:
	 * - No longer using xml files for configuration
	 * 
	 * Actuator Dependency provide documents and health endpoints.
	 *  e.g. /health. /bean, /info
	 *  
	 * Devtools Dependency: Automatic restart when there is a change to the code (like angular).
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
}
