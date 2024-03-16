package com.Examole.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.Examole.demo.Entity.Employee;
import com.Examole.demo.Repo.EmpRepo;
import com.Examole.demo.Specification.EmpSpecification;

@Service
public class EmpService {
	@Autowired
	private EmpRepo er;

	public void getEmpBySpec(String name, Double maxSalary) {
		Specification<Employee> spec = Specification.where(null);
		if (name != null) {
			spec = spec.and(EmpSpecification.nameLike(name));
		}
		if (maxSalary != null) {
			spec = spec.and(EmpSpecification.lessThanSalary(maxSalary));
		}
		er.findAll(spec).forEach(System.out::println);
	}
}
