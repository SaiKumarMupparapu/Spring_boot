package com.Examole.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Examole.demo.Entity.Student;

public interface Studentrepo extends JpaRepository<Student, Long> {

}
