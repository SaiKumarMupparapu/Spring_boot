package com.DB.jpa.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.DB.jpa.Entity.Applicant;

public interface ApplicantRepo extends CrudRepository<Applicant,Integer> {

	List<Applicant> findByName(String name);


	List<Applicant> findByAgeGreaterThan(Integer age);


}
