package com.Examole.demo.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examole.demo.Entity.Passport;
import com.Examole.demo.Entity.PersonPs;
import com.Examole.demo.Repo.PersonRepo;
@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	public void savePerson() {
		PersonPs p=new PersonPs();
		p.setName("sai");
		p.setGender("mal");
	
		Passport pspt=new Passport();
		pspt.setPasNum("sedrtf123");
		pspt.setIssuedDate(LocalDate.now());
		pspt.setExpyDate(LocalDate.now().plusYears(10));
		pspt.setP(p);
		
		p.setPs(pspt);
		
		personRepo.save(p);
		

	}
	public void getPerson() {
		List<PersonPs> list = personRepo.findAll();
		list.forEach(System.out::println);
		
	}

}
