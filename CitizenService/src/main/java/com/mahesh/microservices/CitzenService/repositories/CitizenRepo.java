package com.mahesh.microservices.CitzenService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.microservices.CitzenService.Entity.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

	public List<Citizen> findByVaccinationCenterId(Integer id);
}
