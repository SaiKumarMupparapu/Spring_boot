package com.DB.jpa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.DB.jpa.Entity.Employee;
import com.DB.jpa.Repo.EmpRepo;

@Service
public class EmpService {
    
	private EmpRepo erpo;
    @Autowired
	public EmpService(EmpRepo erpo) {
		this.erpo = erpo;
	}
	public void getSortedEmp() {
		Sort asdSort = Sort.by("salary").ascending();
		erpo.findAll(asdSort).forEach(System.out::println);
		
//		erpo.findAll(Sort.by("salary").ascending()).forEach(System.out::println);
	}

	public void getSortedEmpDescById() {
		// TODO Auto-generated method stub
		erpo.findAll(Sort.by("id").descending()).forEach(System.out::println);
		
	}
	
	
	public void empPagination(int pageNumber, int pageSize) {
		PageRequest pageRequest = PageRequest.of(pageNumber-1,pageSize,Sort.by("name").ascending());
		
		erpo.findAll(pageRequest).forEach(System.out::println);
	}
	
	public void getEmpWithFilter() {
		Employee entity=new Employee();
		entity.setName("srinu");
		entity.setSalary(12345.0);
		
		Example<Employee> example = Example.of(entity);
		
		erpo.findAll(example).forEach(System.out::println);
		
	}
	
	
	
	
	
	
	
	
	
	
}
