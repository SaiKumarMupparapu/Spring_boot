package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Chip32 implements IChip {

	
	public Chip32() {
		System.out.println("chip32::constractor");
	}

	@Override
	public boolean process() {
		// TODO Auto-generated method stub
		return false;
	}

}
