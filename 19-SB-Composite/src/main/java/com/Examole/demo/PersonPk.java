package com.Examole.demo;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPk {

	private Integer id;
	private String passport;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "PersonPk [id=" + id + ", passport=" + passport + "]";
	}
	
}
