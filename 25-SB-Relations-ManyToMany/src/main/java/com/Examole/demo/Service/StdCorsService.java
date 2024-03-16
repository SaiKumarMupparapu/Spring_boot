package com.Examole.demo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examole.demo.Entity.Course;
import com.Examole.demo.Entity.Student;
import com.Examole.demo.Repo.CourseRepo;
import com.Examole.demo.Repo.Studentrepo;
@Service
public class StdCorsService {
	@Autowired
	private Studentrepo srepo;
	@Autowired
	private CourseRepo crepo;
	
	public void saveStdCrs() {
		Student s1=new Student();
		s1.setName("pasha");
		
		Course c1=new Course();
		c1.setcName("java");
		
		Course c2=new Course();
		c2.setcName("UI");
		
		Course c3=new Course();
		c3.setcName("Spring&boot");
		
		
		List<Course> crsList = Arrays.asList(c1,c2);
		
		s1.setCourse(crsList);
		
		srepo.save(s1);
		
		System.out.println("records saved");
	}
	

}
