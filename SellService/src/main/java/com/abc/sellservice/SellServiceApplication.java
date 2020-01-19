package com.abc.sellservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class SellServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate geTemplate(){
		return new RestTemplate();
	}
}
