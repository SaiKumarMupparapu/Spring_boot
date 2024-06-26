package com.example.demo.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repo.EmployeeRepo;

@Service
public class EmpService {
	private EmployeeRepo empr;
    @Autowired // it is optional if only one param constructor is avilable
	public EmpService(EmployeeRepo empr) {
		this.empr = empr;
	}

	// save a single employee details

	public void saveEmp(Integer id, String name, Double salary) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);

		empr.save(emp);
		System.out.println("recprds saved");
	}

	// save list of employees

	public void saveEmp(List<Employee> empList) {
		
		empr.saveAll(empList);

		System.out.println("employees details saved");
	}

	// find a employee based on primary key

	public void getEmployee(Integer id) {

		// optional is introduced to eliminate null pointer exception
		// it is a container it may or may not contain non-null value
		Optional<Employee> emp = empr.findById(id);

		if (emp.isPresent()) {
			Employee employee = emp.get();
			System.out.println(employee);
		} else {
			System.out.println("no record avilable");
		}

	}

	public void getAllEmp(List<Integer> ids) {
		Iterable<Employee> allById = empr.findAllById(ids);
		allById.forEach(System.out::println);
	}

	public void getAllEmpl() {
		Iterable<Employee> allemp = empr.findAll();
		allemp.forEach(System.out::println);
	}

	public void checkRedord(Integer id) {
		boolean existsById = empr.existsById(id);
		if (existsById)
			System.out.println("record is present");
		else
			System.out.println("record is not present");
	}

	public void totRecords() {
		System.out.println(empr.count());
	}

	public void delById(Integer id) {
		empr.deleteById(id);
		System.out.println("record is deleted");
	}

	public void deleteAllByIds(Iterable<Integer> ids) {
		empr.deleteAllById(ids);
		System.out.println("records deleted");
	}

	public void delEmp(Employee emp) {
		empr.delete(emp);
		System.out.println("records deleted");

	}

	public void delemps(Iterable<Employee> emp) {
		empr.deleteAll(emp);
		System.out.println("records deleted");
	}

	public void delAll() {
		empr.deleteAll();
		System.out.println(" all records deleted");
	}

}
