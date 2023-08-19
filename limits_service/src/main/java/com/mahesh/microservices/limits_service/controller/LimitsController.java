package com.mahesh.microservices.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.microservices.limits_service.configurations.Configuration;
import com.mahesh.microservices.limits_service.limitservice.bean.Limits;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;// = new Configuration();
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
//		return new Limits(1,1000);
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
