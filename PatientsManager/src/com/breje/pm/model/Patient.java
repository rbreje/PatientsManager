package com.breje.pm.model;

import java.util.StringJoiner;

public class Patient implements IAppElement {
	private String patientId;
	private String name;
	private String SSN;
	private String address;
	private int consNum;

	public Patient() {
	}

	public Patient(String name, String SSN, String address) {
		patientId = SSN;
		this.name = name;
		this.SSN = SSN;
		this.address = address;
		consNum = 0;
	}

	public String getPatientID() {
		return patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
		patientId = SSN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setConsNum(int num) {
		consNum = num;
	}

	public int getConsNum() {
		return consNum;
	}

	public String toString() {
		StringJoiner sj = new StringJoiner(", ");
		sj.add(name).add(SSN).add(address);
		return sj.toString();
	}
}
