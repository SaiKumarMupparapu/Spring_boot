package com.DB.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DB.jpa.Service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmpService servObj = run.getBean(EmpService.class);
		
		//Retrieving records in ascending order
		servObj.getSortedEmp();
		System.out.println("===============================");
		//Retrieving records in descending order
		servObj.getSortedEmpDescById();
		System.out.println("==============================================================");
		servObj.empPagination(3,3);
		System.err.println("==============================================================");
		servObj.getEmpWithFilter();
		
		
		
	}

}
