package com.demo.HealthCareManagement.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	private String patientName;
	private int patientId;
	private String patientNumber;
	
	public Patient () {
		
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}
	
	public Patient(String patientName, int patientId, String patientNumber) {
		super();
		this.patientName = patientName;
		this.patientId = patientId;
		this.patientNumber = patientNumber;
	}

	
	
}
