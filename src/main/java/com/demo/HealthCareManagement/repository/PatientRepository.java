package com.demo.HealthCareManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.HealthCareManagement.enitity.Patient;

public interface PatientRepository extends JpaRepository<Patient,String> {
	
	
	

}
