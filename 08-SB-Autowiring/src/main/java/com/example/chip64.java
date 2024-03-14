package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary

public class chip64 implements IChip {
	
	

	public chip64() {
		System.out.println("chip64::constractor");
		
	}

	@Override
	public boolean process() {
		// TODO Auto-generated method stub
		return true;
	}

}
