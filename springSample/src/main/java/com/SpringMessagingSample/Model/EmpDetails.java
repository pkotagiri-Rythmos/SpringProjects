package com.SpringMessagingSample.Model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class EmpDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    private int id;
	private String street;
	private String city;
	private String state;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
}
