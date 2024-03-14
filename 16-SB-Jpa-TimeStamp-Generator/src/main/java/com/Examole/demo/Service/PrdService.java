package com.Examole.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examole.demo.Entity.Product;
import com.Examole.demo.Repo.ProductRepo;

@Service
public class PrdService {
 
	private ProductRepo pr;
    
	@Autowired
	public PrdService(ProductRepo pr) {
		this.pr = pr;
	}
	
	public void saveProduct() {
		Product p=new Product();
//		p.setId(1);
		p.setName("keyboard");
		p.setPrice(1000.0);
		
		pr.save(p);
		System.out.println("record saved");
	}
}
