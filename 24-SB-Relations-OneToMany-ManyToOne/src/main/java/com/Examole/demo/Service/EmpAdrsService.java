package com.Examole.demo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examole.demo.Entity.Address;
import com.Examole.demo.Entity.Employee;
import com.Examole.demo.Repo.EmployeeRepo;
@Service
public class EmpAdrsService {
	@Autowired
	private EmployeeRepo empRepo;
	
	public void saveEmplAdr() {
		Employee e=new Employee();
		e.setName("sai");
		e.setSalary(123.00);
		
		
		Address a1=new Address();
		a1.setCity("khammam");
		a1.setState("TS");
		a1.setCountry("Bharath");
		a1.setAdrsType("present");
		a1.setEmp(e);
		
		Address a2=new Address();
		a2.setCity("Warengal");
		a2.setState("TS");
		a2.setCountry("Bharath");
		a2.setAdrsType("permanent");
		a2.setEmp(e);
		
		e.setAdrs(Arrays.asList(a1,a2));
		
		empRepo.save(e);
	}
	public void getEmpAdr() {
		List<Employee> list = empRepo.findAll();
		
	}

}
