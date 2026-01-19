package Day9_abstraction;

public abstract class Bank {
	public abstract void getInterestRate();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank s = new SBI();
		s.getInterestRate();
		
		Bank h = new HDFC();
		h.getInterestRate();

	}

}

class SBI extends Bank{
	public void getInterestRate() {
		System.out.println("SBI interest rate");
	}
}

class HDFC extends Bank{
	public void getInterestRate() {
		System.out.println("HDFC interest rate");
	}
}

