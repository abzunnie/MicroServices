package com.abc.userregservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserRegController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/")
	public String sayHello(){
		return " All is well "+env.getProperty("local.server.port");
		
	}

}
