package Day5Assignment;

public class Bank {
	
	   int accountNumber;
	    double balance;

	   
	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Balance: " + balance);
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new Bank(); 
        b1.accountNumber = 1001;
        b1.balance = 5000;

        Bank b2 = new Bank(); 
        b2.accountNumber = 1002;
        b2.balance = 3000;

        b1.deposit(2000);
        b2.deposit(1000);

	}

}
