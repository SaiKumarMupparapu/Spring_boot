package com.example.demo.Service;


import com.example.demo.binding.User;

public interface UserServiceInterface {
	
	public Boolean saveUser(User u);
	
	public Boolean validateUser(String email,String password);

}
