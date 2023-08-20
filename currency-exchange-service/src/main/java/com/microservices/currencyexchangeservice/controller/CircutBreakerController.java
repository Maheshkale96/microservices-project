package com.microservices.currencyexchangeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircutBreakerController {
	
	@GetMapping("/sample-api")
	public String sampleApi() {
		return "Sample API";
	}

}
