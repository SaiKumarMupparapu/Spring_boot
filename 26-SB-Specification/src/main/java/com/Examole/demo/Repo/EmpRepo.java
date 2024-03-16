package com.Examole.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Examole.demo.Entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {
	public List<Employee> findAll(Specification<Employee> spec);

}
