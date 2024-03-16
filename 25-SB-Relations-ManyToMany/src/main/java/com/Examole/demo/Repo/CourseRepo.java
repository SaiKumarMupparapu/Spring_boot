package com.Examole.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Examole.demo.Entity.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {

}
