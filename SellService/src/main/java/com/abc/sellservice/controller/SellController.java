package com.abc.sellservice.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sales")
public class SellController {
	
	@GetMapping("/")
	public String sayHello(){
		return "All is well in Sales";		
	}

}
