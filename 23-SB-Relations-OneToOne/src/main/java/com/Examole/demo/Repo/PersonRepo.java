package com.Examole.demo.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Examole.demo.Entity.PersonPs;

public interface PersonRepo extends JpaRepository<PersonPs,Long> {
	
}
