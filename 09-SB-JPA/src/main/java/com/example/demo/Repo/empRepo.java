package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

//@Repository it is optional .we are extending jpa repository
public interface empRepo extends JpaRepository<Employee, Integer> {

}
