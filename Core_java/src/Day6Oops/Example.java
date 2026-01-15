package Day6Oops;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Encapsulation s = new Encapsulation();
//		s.name="Setu";
//		s.setPass(123456);
//		System.out.println(s.name);
//		System.out.println(s.getPass());
//		
//		Trainer t=new Trainer(1,"xyz",36363);
//		System.out.println(t.getPass());
//		
		Account a = new Account();
		a.setPass(12474);
		a.setid(1);
		a.getPass();
		a.getid();
		a.setBalance(45.0);
		a.getBalance(12474);
		System.out.println(a.getPass());
		System.out.println(a.getBalance(12474));

	}

}
