package com.DB.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DB.jpa.Entity.Employee;
import com.DB.jpa.Repo.EmpRepo;

@Service
public class EmpService {
	
	private EmpRepo erpo;
    @Autowired
	public EmpService(EmpRepo erpo) {
		this.erpo = erpo;
	}
    
    public void  getAllEmps() {
    	 erpo.getEmpsHQL().forEach(System.out::println);
    }
    public void getById(Integer id) {
    	erpo.getEmpByIdHQL(id).forEach(System.out::println);
    }
	
    public void getEmpsByNativeSql() {
    	erpo.getEmpByIdNative().forEach(System.out::println);
    }
	

}
