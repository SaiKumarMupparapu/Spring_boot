package com.DB.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DB.jpa.Entity.Applicant;
import com.DB.jpa.Repo.ApplicantRepo;

@Service
public class ApplicantService {

	private ApplicantRepo arpo;

	@Autowired
	public ApplicantService(ApplicantRepo arpo) {
		this.arpo = arpo;
	}

	public void totRecords() {
		System.out.println(arpo.count());
	}
	
	
//	 retrive records based on non-primary key column
	public void getApplicantsByName(String name) {
//		 you have declare this method in interface 
//		i.e List<Applicants> findByName(String name);
		
//		List<Applicant> applicantsByName = arpo.findByName(name);
//		applicantsByName.forEach(System.out::println);
		
		arpo.findByName(name).forEach(System.out::println);

	}

//   retrive applicant age greater than 18
	public void getAppByAge(Integer age) {
//	   you have declare this method in interface
		arpo.findByAgeGreaterThan(age).forEach(e -> System.out.println(e));

	}

}
