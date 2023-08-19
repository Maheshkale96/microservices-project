package com.mahesh.microservices.CitzenService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitzenController {

	
	@RequestMapping("/testing")
	public String testing() {
		return "Working";
	}
}
