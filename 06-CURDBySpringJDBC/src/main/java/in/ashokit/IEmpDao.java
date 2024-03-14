package in.ashokit;

import java.util.List;

public interface IEmpDao {
	boolean insert();

	boolean update();

	boolean delete();

	List<Employee> getById();

	List<Employee> getAll();

}
