package com.abc.APIGatewayLB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableAutoConfiguration
public class ApiGatewayLbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayLbApplication.class, args);
	}

}
