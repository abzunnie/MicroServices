package com.abc.sellservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.ribbon.proxy.annotation.Http.HttpMethod;

@RestController
@RequestMapping("sales")
public class SellController {
	
	@GetMapping("/")
	public String sayHello(){
		return "All is well in Sales";		
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getProduct")
	public String getProduct(){
		ResponseEntity<String> response = restTemplate.exchange("http://192.168.1.47:8011/product-ws/products/", org.springframework.http.HttpMethod.GET, null, String.class);
		return response.getBody(); 
	}
}
