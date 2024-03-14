package in.app;

public class DebitCard implements IPayment{
	
	public  DebitCard() {
		System.out.println("we are inside of debitcard constructor");
	}

	@Override
	public boolean pay(double amt) {
		// TODO Auto-generated method stub
		System.out.println("debitcard payment processing.....");
		return true;
	}

}
