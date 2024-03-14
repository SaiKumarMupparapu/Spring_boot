package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Table(name="emp_tbl") it optional if our entity class name and table name are same

@Entity
public class Employee {
	// @Column it optional if table column name and entity variable name are same
	@Id // map entity variable with primary key column in db table
	private Integer id;
	private String name;
	private Double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

}
