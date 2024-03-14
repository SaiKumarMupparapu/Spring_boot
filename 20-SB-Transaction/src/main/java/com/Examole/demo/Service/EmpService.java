package com.Examole.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Examole.demo.Entity.Address;
import com.Examole.demo.Entity.Employee;
import com.Examole.demo.Repo.AddressRepo;
import com.Examole.demo.Repo.EmpRepo;
@Service
public class EmpService {

	private EmpRepo er;
	private AddressRepo ar;
	@Autowired
	public EmpService(EmpRepo er, AddressRepo ar) {
		this.er = er;
		this.ar = ar;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void save() {
		Employee e=new Employee();
		e.setName("ram");
		e.setSalary(123456789.0);
		
		Employee save = er.save(e);
		 Address ad=new Address();
		 ad.setCity("hyd");
		 ad.setState("TS");
		 ad.setEid(save.getEid());
		 
		  ar.save(ad);
		
		}
	
	
	
}
