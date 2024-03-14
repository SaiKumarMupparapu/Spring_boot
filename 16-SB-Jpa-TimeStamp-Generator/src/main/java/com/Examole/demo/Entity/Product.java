package com.Examole.demo.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private String id;
	private String name;
	private double price;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate currentDate;
//	@Column(insertable = false)
//	@UpdateTimestamp()
//	private LocalDate updatedDate;
	
	public LocalDate getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
//	public LocalDate getUpdatedDate() {
//		return updatedDate;
//	}
//	public void setUpdatedDate(LocalDate updatedDate) {
//		this.updatedDate = updatedDate;
//	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	

	
}

