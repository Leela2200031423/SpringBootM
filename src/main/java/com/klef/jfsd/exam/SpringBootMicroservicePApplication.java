package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootMicroservicePApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicePApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate ()
	{
		return new RestTemplate();
	}
}
