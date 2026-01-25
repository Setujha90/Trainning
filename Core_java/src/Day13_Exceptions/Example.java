package Day13_Exceptions;

public class Example {
	
	public static void arrayoutof() {
		int [] arr1 = {2,4,5,3};
		try {
		System.out.println(arr1[0]);
		System.out.println(arr1[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
		}
		System.out.println("End");
	}
	
	public static void arith() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayoutof();
		arith();
		

	}

}
