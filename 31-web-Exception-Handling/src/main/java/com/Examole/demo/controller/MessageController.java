package com.Examole.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

	@GetMapping("/welcome")
	public String message(Model model) {
//		int i=10/0;
		model.addAttribute("msg","welcome home");
		return "index";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String exceptioHandeler(Exception e,Model model) {
		model.addAttribute("msg",e.toString());
		return "exception";
	}
	
	
}
