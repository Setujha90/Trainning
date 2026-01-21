package Day11_Access_Modifier;

public class Singleton {
	
	private static Singleton s;
	
	private Singleton() {
		System.out.println("Singleton constructor");
	}
	
	public static Singleton getObject() {
		if(s==null) { //Creating object through constructor only one time
			System.out.println("Creating object");
			s = new Singleton();
			
		}
		return s;
	}
	
	public void m1() {
		System.out.println("Hello");
	}
	
	

}


