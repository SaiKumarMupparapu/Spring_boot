package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee ,Integer> {

}
