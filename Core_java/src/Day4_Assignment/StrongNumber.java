package Day4_Assignment;

import java.util.Scanner;

public class StrongNumber {
	
	public static int fact(int num) {
		if(num<1) return 1;
		return num*fact(num-1);
		
	}
	
	public static boolean Strong(int n) {
		int original=n;
		int sum =0;
		while(n>0) {
			int digit =n%10;
			sum += fact(digit);
			n=n/10;
		}
		
		if(original==sum) return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		if(Strong(num)) System.out.println("Strong number");
		else System.out.println("Not a strong number");
		
		sc.close();
		

	}

}
