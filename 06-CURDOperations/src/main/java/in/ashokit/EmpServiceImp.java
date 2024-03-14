package in.ashokit;

public class EmpServiceImp implements IEmpService {
	private IEmpDao dao;
	

	public void setDao(IEmpDao dao) {
		this.dao = dao;
	}

	@Override
	public void insert() {
		boolean save = dao.save();
		System.out.println(save?"inserted sucessfully":"not inserted");
	}

	@Override
	public void getById() {
		dao.findById();

	}

	@Override
	public void getAll() {
		dao.finadAll();
	}

	@Override
	public void update() {
		int update = dao.update();
		System.out.println(update>0?"updated sucessfully":"not updated ");

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		int delete = dao.delete();
		System.out.println(delete>0?"deleted sucessfully":"not deleted ");

	}

}
