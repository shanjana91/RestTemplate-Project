package com.steria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestTemplateApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();                 //could use RestTemplate Builder also to configure and create a restTemplate bean
	}

}
