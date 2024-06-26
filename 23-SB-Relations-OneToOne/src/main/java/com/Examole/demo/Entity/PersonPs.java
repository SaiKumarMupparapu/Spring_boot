package com.Examole.demo.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PersonPs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	
	private String name;
	
	private String gender;
	
	@OneToOne(mappedBy = "p",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Passport ps;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Passport getPs() {
		return ps;
	}

	public void setPs(Passport ps) {
		this.ps = ps;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", ps=" + ps + "]";
	}

}
