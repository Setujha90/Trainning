package Day4_Assignment;
import java.util.*;

public class HappyNumber {
	
	public static boolean isHappy(int n) {
		while(n!=1 && n!=4) {
			int sum =0;
			while(n>0) {
				int digit =n%10;
				sum += digit*digit;
				n=n/10;
			}
			
			n = sum;
		}
		if(n==1) return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		if(isHappy(num)) System.out.println("Happy number");
		else System.out.println("Not a happy number");
		
		sc.close();
		

	}

}
