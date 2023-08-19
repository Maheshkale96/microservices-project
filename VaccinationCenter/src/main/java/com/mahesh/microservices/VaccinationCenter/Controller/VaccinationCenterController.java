package com.mahesh.microservices.VaccinationCenter.Controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mahesh.microservices.CitzenService.Entity.Citizen;
import com.mahesh.microservices.VaccinationCenter.Entity.VaccinationCenter;
import com.mahesh.microservices.VaccinationCenter.Model.RequiredResponse;
import com.mahesh.microservices.VaccinationCenter.Repo.CenterRepo;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {

	
	@Autowired
	private CenterRepo repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping(path = "/add")
	public ResponseEntity<VaccinationCenter> addCenter(@RequestBody VaccinationCenter newCenter){
		VaccinationCenter vaccinationCenter = repo.save(newCenter);
		return new ResponseEntity<>(vaccinationCenter,HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/id/{id}")
	public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterId(@PathVariable Integer id){
		
		RequiredResponse requiredResponse = new RequiredResponse();
		
		VaccinationCenter center= repo.findById(id).get();
		requiredResponse.setCenter(center);
		java.util.List<Citizen>  listOfCitizen = (java.util.List<Citizen>) restTemplate.getForObject("http://localhost:8001/citizen/id/"+id, List.class);
		requiredResponse.setCitizens(listOfCitizen);
		return new ResponseEntity<RequiredResponse>(requiredResponse,HttpStatus.OK);
		
	}
}
