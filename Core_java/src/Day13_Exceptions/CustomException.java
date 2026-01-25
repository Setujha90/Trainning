package Day13_Exceptions;

public class CustomException extends RuntimeException {
	
	public CustomException(String message) {
		super(message);
	}
	
	public static void main(String[] args) {
		try {
		int age =-1;
		if(age>0) {
			System.out.println("Age is valid");
		}
		else {
			throw new CustomException("Not valid");
		}
		}catch(CustomException e){
			System.out.println("Agetypeofexception");
		}
	}

}
