package in.ashokIt;

public class ATM {
	private IPrinter printer;

	public ATM(IPrinter printer) {
		System.out.println("ATM -param :: constructor");
		this.printer = printer;
	}
	public ATM() {
		System.out.println("Atm -0 param :: constructor");

	}

	/*public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}*/
	public void withdraw() {
		System.out.println("ATM withdraw Method \n payment done");
		printer.print();
		
	}
	

}
