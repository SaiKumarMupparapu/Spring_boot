package com.DB.jpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DB.jpa.Entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
