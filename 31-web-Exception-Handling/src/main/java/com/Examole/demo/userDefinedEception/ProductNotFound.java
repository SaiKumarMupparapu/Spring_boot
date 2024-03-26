package com.Examole.demo.userDefinedEception;

public class ProductNotFound extends Exception{

	public ProductNotFound() {
		super();
	}
	public ProductNotFound(String msg) {
		super(msg);
	}
	

}
