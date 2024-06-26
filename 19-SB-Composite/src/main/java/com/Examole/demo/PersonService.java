package com.Examole.demo;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

	private PersonRepo pr;

	public PersonService(PersonRepo pr) {
		this.pr = pr;
	}

	public void savePerson() {
		
		PersonPk pk=new PersonPk();
		pk.setId(1);
		pk.setPassport("12asd34fv");
		
		Person p=new Person();
		p.setName("sai");
		p.setEmail("asdf@gmail.com");
		p.setPk(pk);
		
		pr.save(p);
		System.out.println("record saved");
	}
	
	public void getPerson() {
		PersonPk pk=new PersonPk();
		pk.setId(1);
		pk.setPassport("12asd34fv");
		
		Optional<Person> byId = pr.findById(pk);
		
		if(byId.isPresent())System.out.println(byId.get());
		else System.out.println("no record avilable");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
