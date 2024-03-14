package in.app;

public class CreditCard implements IPayment {

	public  CreditCard() {
		System.out.println("we are inside creditcard constructor");
	}
	@Override
	public boolean pay(double amt) {
		// TODO Auto-generated method stub
		System.out.println("creditcard payment processing.....");
		return true;
	}

}
