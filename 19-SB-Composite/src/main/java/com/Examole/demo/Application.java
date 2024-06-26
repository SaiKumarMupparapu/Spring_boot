package com.Examole.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run =
				SpringApplication.run(Application.class, args);
	
		PersonService bean = run.getBean(PersonService.class);
	
		bean.savePerson();
	
		bean.getPerson();
	
	}

}
