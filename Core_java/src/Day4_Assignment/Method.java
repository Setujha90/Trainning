package Day4_Assignment;
import java.util.Scanner;

public class Method {
	
	public static boolean isLeap(int n) {
		if((n%400==0) || (n%4==0 && n%100!=0) ) return true;
		return false;
		
	}
	
	public static boolean isCountEqual(int n) {
		int counteven =0;
		int countodd =0;
		
		while(n !=0) {
			int digit = n%10;
			if(digit%2==0) counteven++;
			else countodd++;
			n = n/10;
		}
		
		if(counteven==countodd) return true;
		return false;
	}
	
	public static String isgood(int pali) {
		  
	        int original = pali;
	        int reverse = 0;

	        while (pali > 0) {
	            int digit = pali % 10;
	            reverse = reverse * 10 + digit;
	            pali = pali / 10;
	        }

	        if (original == reverse) {
	            return "Good";
	        } 
	        return "Bad";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your year");
		int year = sc.nextInt();
		
		if(isLeap(year)) {
			System.out.println("Leap year");
		}
		else
		System.out.println("Not a leap year");
		
		System.out.println("Enter your number");
		int number = sc.nextInt();
		if(isCountEqual(number)) {
			System.out.println("Count of even and odd digit are equal");
		}
		else {
			System.out.println("Count of even and odd digit are not equal");
		}
		
		String goodorbad = isgood(number);
		System.out.println(goodorbad);
		
		sc.close();

	}

}
