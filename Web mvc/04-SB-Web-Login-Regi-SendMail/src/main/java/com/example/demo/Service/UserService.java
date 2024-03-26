package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.UserRepo;
import com.example.demo.binding.User;
@Service
public class UserService  implements UserServiceInterface{
	@Autowired
	private UserRepo ur;
	
	@Autowired
	private JavaMailSender mailSender;

	@Override
	public Boolean saveUser(User u) {
		User save = ur.save(u);
		return save.getId()!=null;
		
	}

	

	public void sendMessage(String email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("Account Created succefully");
		message.setText("hi sir, your acoount was create successfully./n /t thanku you for registring");
		mailSender.send(message);
	}
	
	@Override
	public Boolean validateUser(String email, String password) {
		
		 Optional<User> byEmail = ur.findByEmail(email);
		 return byEmail.isPresent() && byEmail.get().getPswd().equals(password);
	}
	

}
