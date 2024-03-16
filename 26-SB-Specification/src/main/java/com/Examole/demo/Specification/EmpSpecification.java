package com.Examole.demo.Specification;

import org.springframework.data.jpa.domain.Specification;

import com.Examole.demo.Entity.Employee;

public class EmpSpecification {

	public static Specification<Employee> nameLike(String name) {
		return (root, query, CriteriaBuilder) -> CriteriaBuilder.like(root.get("name"), "%" + name + "%");
	}

	public static Specification<Employee> lessThanSalary(Double salary) {
		return (root, query, CriteriaBuilder) -> CriteriaBuilder.lessThan(root.get("salary"), salary);
	}

}
