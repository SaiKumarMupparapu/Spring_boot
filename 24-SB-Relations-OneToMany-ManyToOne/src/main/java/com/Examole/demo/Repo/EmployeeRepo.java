package com.Examole.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Examole.demo.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{

}
