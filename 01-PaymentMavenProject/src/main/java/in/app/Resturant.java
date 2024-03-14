package in.app;

public class Resturant {
	private IPayment payment;
   /*   public  Resturant() {
		System.out.println("we are inside resturant constructor");
	}*/
	
	public Resturant(IPayment payment) {
		this.payment = payment;
	}
      
    /*  public void setPayment(IPayment payment) {
    	  System.out.println("resturant :: setter method  ");
  		this.payment = payment;
  	}*/

	public void collectBill(double amt) {
		boolean status = payment.pay(amt);
		if(status)System.out.println("payment done");
		else System.out.println("payment cancled");;
	}

	

	

}
