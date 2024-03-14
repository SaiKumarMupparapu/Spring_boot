package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.Robot;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contxt = SpringApplication.run(Application.class, args);
		Robot RobotObj = contxt.getBean(Robot.class);
		RobotObj.process();
		System.out.println(RobotObj.hashCode());
		Robot RobotObj1 = contxt.getBean(Robot.class);
		System.out.println(RobotObj1.hashCode());
	
	}

}
