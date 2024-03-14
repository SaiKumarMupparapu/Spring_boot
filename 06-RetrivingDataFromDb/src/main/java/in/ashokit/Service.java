package in.ashokit;

import java.util.List;
import java.util.ListIterator;

public class Service {
	 private IEmpDao idao;

	public void setIdao(IEmpDao idao) {
		this.idao = idao;
	}
	 public void data() {
		 List<Employee> listEmp = idao.listEmp();
		 for(Employee l:listEmp) {
			 System.out.println(" id :"+l.getId()+"\n Name :"+l.getName()+"\n Salary :"+l.getSalary());
			 
		 }
	
	 }
}
