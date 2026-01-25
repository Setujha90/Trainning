package Day13_Exceptions;

public class ExampleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hii");
//		try {
//			Thread.sleep(4000);
//			
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			
//			System.out.println("check exception");
//		}
		
		try {
			//what class.forname do?????
			Class.forName("Day13_Exceptions.Example"); //if wrong name given catch block print the their statement
			
		} catch (ClassNotFoundException  e) {
			System.out.println("class info is wrong");
			// TODO: handle exception
		}
		System.out.println("Setu");

	}

}
