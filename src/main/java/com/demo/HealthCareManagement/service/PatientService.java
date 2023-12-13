package com.demo.HealthCareManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.HealthCareManagement.enitity.Patient;
import com.demo.HealthCareManagement.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	PatientRepository patientrepository;
	
	
	public String patser(Patient patient) {
		
		patientrepository.save(patient);
		return "nishi";
	}
	
	

}
