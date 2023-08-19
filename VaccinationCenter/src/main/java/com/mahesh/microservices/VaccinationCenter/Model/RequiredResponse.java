package com.mahesh.microservices.VaccinationCenter.Model;

import java.util.List;

import com.mahesh.microservices.VaccinationCenter.Entity.VaccinationCenter;

import jakarta.persistence.Entity;

import com.mahesh.microservices.CitzenService.Entity.Citizen;


public class RequiredResponse {

	private VaccinationCenter center;
	private List<Citizen> citizens;
	
	
	public RequiredResponse() {
		super();
	}


	public RequiredResponse(VaccinationCenter center, List<Citizen> citizens) {
		super();
		this.center = center;
		this.citizens = citizens;
	}


	public VaccinationCenter getCenter() {
		return center;
	}


	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}


	public List<Citizen> getCitizens() {
		return citizens;
	}


	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}
	
	
	
	
}
