package in.ashokit;

import java.util.List;

public class EmpServiceImp implements IEmpService {
	private IEmpDao empDao;

	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public void add() {
		boolean inserted = empDao.insert();
		System.out.println(inserted ? "inserted sucessfully" : "not inserted");
	}

	@Override
	public void modify() {
		boolean updated = empDao.update();
		System.out.println(updated ? "updated sucessfully" : "not update");
	}

	@Override
	public void remove() {
		boolean deleted = empDao.delete();
		System.out.println(deleted ? "deleted sucessfully" : "not deleted");
	}

	@Override
	public void search() {
		List<Employee> empList = empDao.getById();
		for (Employee e : empList) {
			System.out.println("id :" + e.getId() + "\nName :" + e.getName() + "\nSalary :" + e.getSalary());

		}
	}

	@Override
	public void get() {
		List<Employee> emplist = empDao.getAll();
		for (Employee e : emplist) {
			System.out.println("id :" + e.getId() + "\nName :" + e.getName() + "\nSalary :" + e.getSalary());

		}
	}

}
