package in.user.bean;

public class UserDaoImp implements IUserDao {
	public UserDaoImp() {
		System.out.println("userDaoImp :: constructor");
	}

	@Override
	public String findName(int i) {
		// TODO Auto-generated method stub
		if(i==100) return "sai" ;
		else if(i==99) return "kumar";
		return null;
	}

}
