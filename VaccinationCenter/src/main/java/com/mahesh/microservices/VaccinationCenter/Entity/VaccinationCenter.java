package com.mahesh.microservices.VaccinationCenter.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VaccinationCenter {

	@Id
	private int id;
	private String vaccinationCenterName;
	private String centerAddress;
	
	public VaccinationCenter() {
		super();
	}
	
	public VaccinationCenter(int id, String vaccinationCenterName, String centerAddress) {
		super();
		this.id = id;
		this.vaccinationCenterName = vaccinationCenterName;
		this.centerAddress = centerAddress;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVaccinationCenterName() {
		return vaccinationCenterName;
	}
	public void setVaccinationCenterName(String vaccinationCenterName) {
		this.vaccinationCenterName = vaccinationCenterName;
	}
	public String getCenterAddress() {
		return centerAddress;
	}
	public void setCenterAddress(String centerAddress) {
		this.centerAddress = centerAddress;
	}
	
	
}
