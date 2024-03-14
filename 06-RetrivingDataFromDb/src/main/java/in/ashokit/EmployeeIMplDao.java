package in.ashokit;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeIMplDao implements IEmpDao {
	private JdbcTemplate jdt;
	

	public void setJdt(JdbcTemplate jdt) {
		this.jdt = jdt;
	}


	@Override
	public List<Employee> listEmp() {
		String sql="select * from emp";
		List<Employee> empList = jdt.query(sql,new EmployeeMapper());
		return empList;
	}

}
