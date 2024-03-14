package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.empRepo;
import com.example.demo.entity.Employee;

@Service
public class EmployeeService {
	private empRepo empRepo;

//    @Autowired it is optional if there only one parameterized constructor
	public EmployeeService(empRepo empRepo) {
		this.empRepo = empRepo;
	}

	public void saveEmployee(Integer id,String name,Double salary) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);

		empRepo.save(emp);
//		System.out.println("record inserted...");
		emp.toString();
	}

}
