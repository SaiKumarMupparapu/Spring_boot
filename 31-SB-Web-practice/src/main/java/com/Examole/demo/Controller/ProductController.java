package com.Examole.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Examole.demo.Entity.Product;
import com.Examole.demo.Service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@GetMapping("/load")
	public ModelAndView loadForm() {
	
		ModelAndView mav= new ModelAndView();
		mav.addObject("prdObj",new Product());
		mav.setViewName("form");
		return mav;
	}
	
	@PostMapping("/save")
	public ModelAndView saveProduct(Product p) {
		ModelAndView mav=new ModelAndView();
		Boolean prdSaved = ps.saveProduct(p);
		if(prdSaved)mav.addObject("smsg", "Record saved");
		else mav.addObject("emsg", "Record not saved");
		mav.setViewName("redirect:/load");
		return mav;
	}
	
	@GetMapping("/prds")
	public ModelAndView getPrds() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("list", ps.getAllProducts());
		mav.setViewName("list");
		
		return mav;
		
	}
}
