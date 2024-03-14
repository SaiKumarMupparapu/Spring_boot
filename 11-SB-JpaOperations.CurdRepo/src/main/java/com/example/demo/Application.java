package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		
		EmpService EmpSerObj = context.getBean(EmpService.class);
		
// 1    save a single employee details
		EmpSerObj.saveEmp(1,"srinivas", 123456.0);
		
// 2	save group of employee details
		
			Employee e1 = new Employee();
		
		e1.setId(2);
		e1.setName("kumar");
		e1.setSalary(2345.00);

		Employee e2 = new Employee();
		e2.setId(3);
		e2.setName("srinu");
		e2.setSalary(234.00);

		Employee e3 = new Employee();
		e3.setId(4);
		e3.setName("vijay");
		e3.setSalary(1345.00);
		List<Employee> empList = Arrays.asList(e1, e2, e3);
		
		   EmpSerObj.saveEmp(empList);
		
		
//	3	 get employee details by id
		EmpSerObj.getEmployee(2);
		
//	4	get employee details by collection of id
		EmpSerObj.getAllEmp(Arrays.asList(1,2,3));
		
//	5	get all employees details
		EmpSerObj.getAllEmpl();
		
//	6	get total records in the table
		EmpSerObj.totRecords();
		
//	7	check the record is avilable or not 
		EmpSerObj.checkRedord(1);
		
//	8   delete record from table based on primary key
//		EmpSerObj.delById(3);
		
//	9  delete records based on collection of pk ids
//		EmpSerObj.deleteAllByIds(Arrays.asList(3,4));
		
//	10	delete records based on entity object
//		EmpSerObj.delEmp(e2);
		
//	11	 delete rocords based on collection of entities
//		EmpSerObj.delemps(Arrays.asList(e1,e2));
		
//	12	 delete all records
//		EmpSerObj.delAll();
		
	
	}

}
