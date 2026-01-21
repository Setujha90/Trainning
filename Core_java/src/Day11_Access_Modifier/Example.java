package Day11_Access_Modifier;

public class Example {
	
	private static String a ;//private var
	
	
	private static void m1() {
		System.out.println("Private method");
	}
	
	private Example() { //BY making it private we can't create the object of this class in other class only in this class object can be created
		System.out.println("Private construtor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		Example e = new Example();
		e.m1();

	}

}
