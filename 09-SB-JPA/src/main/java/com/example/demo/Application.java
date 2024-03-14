package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext contxt =
				SpringApplication.run(Application.class, args);
		EmployeeService empObj = contxt.getBean(EmployeeService.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		Integer id=sc.nextInt();
		System.out.println("enter employee name");
		String name=sc.next();
		System.out.println("enter employee salary");
		Double salary=sc.nextDouble();
	   empObj.saveEmployee(id,name,salary);
	}

}
