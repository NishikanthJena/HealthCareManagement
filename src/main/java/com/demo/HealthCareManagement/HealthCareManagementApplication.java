package com.demo.HealthCareManagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.HealthCareManagement.enitity.Patient;
import com.demo.HealthCareManagement.service.PatientService;

@SpringBootApplication
public class HealthCareManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareManagementApplication.class, args);
	}
	
	@Bean
	CommandLineRunner test(PatientService patientservice) {
		
		Patient pat = new Patient();
		
		pat.setPatientName("narendra");
		pat.setPatientId(103);
		pat.setPatientNumber("81");
		
		patientservice.patser(pat);
		
		return null;
	}

}
