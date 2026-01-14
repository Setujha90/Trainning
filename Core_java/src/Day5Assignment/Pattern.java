package Day5Assignment;

public class Pattern {
	
	public static void p(int rows) {
		  for (int i = 1; i <= rows; i++) {

	            for (int j =rows-i; j>0; j--) {
	                System.out.print(" "); 
	            }
     
	            for (int j = 1; j <=2*i-1; j++) {
	                System.out.print("*");
	            }

	            System.out.println(); 
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p(3);

	}

}
