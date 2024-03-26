package com.Examole.demo.globalExceptionHandeler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Examole.demo.userDefinedEception.ProductNotFound;

@ControllerAdvice
public class exceptionHandeler {

	@ExceptionHandler(value = Exception.class)
	public String excpHandeler(Model model, Exception e) {
		model.addAttribute("msg", e.toString());
		return "exception";
	}
	@ExceptionHandler(value = ProductNotFound.class)
	public String excpHandeler(Model model, ProductNotFound e) {
		model.addAttribute("msg",e.toString());
		return "exception";
	}
}
