package com.Examole.demo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Person {

	private String name;
	private String email;
	@EmbeddedId
	private PersonPk pk;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PersonPk getPk() {
		return pk;
	}
	public void setPk(PersonPk pk) {
		this.pk = pk;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", pk=" + pk + "]";
	} 
	
	
	
	
	
}
