package com.Examole.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Examole.demo.Service.PrdService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = 
				SpringApplication.run(Application.class, args);
		
		PrdService PrdtServObj = run.getBean(PrdService.class);
	    
		PrdtServObj.saveProduct();
		
	
	
	
	}

}
