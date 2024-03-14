package in.ashokit;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDaoImp implements IEmpDao {
	private JdbcTemplate jt;
	// private EmpMapper empMapper;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public boolean insert() {
		String sql = "insert into emp values(?,?,?)";
		int saved = jt.update(sql, 1, "Ram", 100000000);
		return saved > 0 ? true : false;
	}

	@Override
	public boolean update() {
		String sql = "update emp set name=? where id=5";
		int updated = jt.update(sql, "kumar");
		return updated > 0 ? true : false;
	}

	@Override
	public boolean delete() {
		String sql = "delete from emp where id=1";
		int deleted = jt.update(sql);
		return deleted > 0 ? true : false;
	}

	@Override
	public List<Employee> getById() {
		String sql = "select * from emp where id=2";
		List<Map<String, Object>> queryForList = jt.queryForList(sql);
		System.out.println(queryForList);
		// List<Employee> empList = jt.query(sql,empMapper);

		List<Employee> empList = jt.query(sql, BeanPropertyRowMapper.newInstance(Employee.class));

		return empList;
	}

	@Override
	public List<Employee> getAll() {
		String sql = "select * from emp";
		// List<Employee> list = jt.query(sql,empMapper);
		List<Employee> list = jt.query(sql, BeanPropertyRowMapper.newInstance(Employee.class));
		return list;
	}

}
