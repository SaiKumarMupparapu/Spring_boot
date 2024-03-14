package in.service.beans;

import in.user.bean.IUserDao;

public class ServiceImp implements IService {
    private IUserDao ud;
    
	public ServiceImp(IUserDao ud) {
		System.out.println("Service :: constructor");
		this.ud = ud;
	}

	@Override
	public String getName(int i) {
		// TODO Auto-generated method stub
		return ud.findName(i);
	}

}
