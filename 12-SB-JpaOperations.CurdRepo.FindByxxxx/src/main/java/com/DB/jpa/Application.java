package com.DB.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DB.jpa.Service.ApplicantService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		
		ApplicantService serviceObj = 
				context.getBean(ApplicantService.class);
		serviceObj.totRecords();
		
		serviceObj.getApplicantsByName("sai");
        
		serviceObj.getAppByAge(18);
		
		
		
	}

}