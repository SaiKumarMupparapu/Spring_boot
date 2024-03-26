package com.Examole.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Examole.demo.userDefinedEception.ProductNotFound;

@Controller
public class UserController {

	@GetMapping("/user")
	public String user(Model model) {
		model.addAttribute("msg", "user ==> sai@kumar@gmail.com");
		String s=null;
		s.length();
		return "index";
	}
	
	@GetMapping("/prd")
	public String productExp(Model model) throws ProductNotFound {
		int i=1;
		if(i<10) {
			throw new ProductNotFound(" product not found with given details");
			
		} else {
			model.addAttribute("msg","product is is :"+i);
		}
		return "index";
	}
}
