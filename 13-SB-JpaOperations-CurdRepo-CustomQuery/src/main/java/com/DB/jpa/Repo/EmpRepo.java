package com.DB.jpa.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.DB.jpa.Entity.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer> {
     @Query("from Employee")
	List<Employee> getEmpsHQL();
     @Query("from Employee where id=:id")
     List<Employee> getEmpByIdHQL(Integer id);
     
     @Query(value = "select * from Employee" ,nativeQuery=true)
     List<Employee> getEmpByIdNative();
     
     

}
