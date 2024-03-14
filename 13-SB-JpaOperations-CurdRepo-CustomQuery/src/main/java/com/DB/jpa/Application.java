package com.DB.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DB.jpa.Service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		EmpService empSerObj =
				context.getBean(EmpService.class);
		
		empSerObj.getAllEmps();
		empSerObj.getById(2);
		empSerObj.getEmpsByNativeSql();
	}

}
