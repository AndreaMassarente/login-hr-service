package com.proconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class LoginHrServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginHrServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getTemplate() {

		return new RestTemplate();
	}

}
