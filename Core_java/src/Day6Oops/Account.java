package Day6Oops;

public class Account {
	private int id;
	private double balance;
	private int password;
	
	public double getBalance(int password) {
		if(this.password==password) {
			return balance;
		}
		System.out.println("Can't fecth the balance");
		return 0.0;
	}
	
	public void setBalance(double balance) {
		if(balance<0) {
			System.out.println("Invalid amount enter "+balance);
			return ;
			
		}
		this.balance +=balance;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setPass(int password) {
		this.password=password;
	}
	
	public int getPass() {
		return password;
	}
	
	public int getid() {
		return id;
	}
	

}
