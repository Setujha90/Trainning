package Day11_Access_Modifier;

public class DBConn {
	
	private static int count =1;
	private DBConn() {

	}
	
	public static DBConn getObject() {
		if(count++<=5) { 
			System.out.println("Creating object");
			return new DBConn();
			
		}
		System.out.println("Can't Create object");
		return null;
	}
	
//	public void m1() {
//		System.out.println("Hello");
//	}
	
	public String toString() { //overriding the toString() method of Object class in child class
		return  "sr";
	}
	

}
