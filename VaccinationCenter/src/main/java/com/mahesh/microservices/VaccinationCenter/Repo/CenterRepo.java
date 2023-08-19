package com.mahesh.microservices.VaccinationCenter.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.microservices.VaccinationCenter.Entity.VaccinationCenter;

public interface CenterRepo extends JpaRepository<VaccinationCenter, Integer> {

}
