package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.UserService;
import com.example.demo.binding.User;

@Controller
public class UserController {
	@Autowired
	private UserService us;
	
	@GetMapping("/")
    public ModelAndView registerForm() {
		ModelAndView mav= new ModelAndView();
		 mav.addObject("userObj", new User());
		 mav.setViewName("register");
		 return mav;
        
    }

    @PostMapping("/register")
    public ModelAndView saveUser( User user) {
        boolean saved = us.saveUser(user);
        ModelAndView mav=new ModelAndView();
        if (saved) {
            // Send email logic
        	
        	us.sendMessage(user.getEmail());
        	
            mav.addObject("msg", "Successfully registred");
           
        } else {
        	mav.addObject("msg", "unable to registred");
        }
        mav.setViewName("redirect:/");
        mav.addObject("userObj", new User());	
               
        return mav;
    }
    
    @GetMapping("/login")
    public String loginForm(@PathVariable String email, @PathVariable String password,Model model) {
    	Boolean validateUser = us.validateUser(email, password);
    	
    	if(validateUser) {
    		return "home";
    	}
    	else {
    		model.addAttribute("msg", "Please enter valid details");
    		return "redirect:/login";
    	}
    	
    	
    }

}
