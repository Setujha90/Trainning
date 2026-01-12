package Day4_Assignment;
import java.util.*;

public class Xylem {
	
	  public static void checkXylemPhloem(int num) {

	        int original = num;

	        int lastDigit = num % 10;
	        int extremeSum = lastDigit;
	        int meanSum = 0;

	        num /= 10; 

	        while (num > 9) { 
	            meanSum += num % 10;
	            num /= 10;
	        }

	        extremeSum += num; 

	        if (extremeSum == meanSum) {
	            System.out.println(original + " is a Xylem Number");
	        } else {
	            System.out.println(original + " is a Phloem Number");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkXylemPhloem(n);

        sc.close();


	}

}
