package com.Examole.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Aid;
	private String city;
	private String state;
	
	private Integer eid;

	public Integer getAid() {
		return Aid;
	}

	public void setAid(Integer aid) {
		Aid = aid;
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

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Address [Aid=" + Aid + ", city=" + city + ", state=" + state + ", eid=" + eid + "]";
	}
	
	
}
