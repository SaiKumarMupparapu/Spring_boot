package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.IChip;

@Component
@Scope("prototype")
public class Robot {
//	@Autowired
	private IChip chip ;
	
	public Robot() {
		System.out.println("Robot::0-constractor");
	}
	@Autowired
	public void setChip(IChip chip) {
		this.chip = chip;
	}
//@Autowired
//	public Robot(IChip bit64) {
//		System.out.println("Robot::param-constractor");
//		this.bit64 = bit64;
//	}

	public void process() {
		boolean status = chip.process();
	   if(status)System.out.println("process done");
	   else System.out.println("process Not done");
	}
	
	
	
	
	

}
