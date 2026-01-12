package Day4_Assignment;
import java.util.*;

public class DisariumNumber {
	
	public static double power(int a,int b) {
		int p =1;
		for(int i =1;i<=b;i++) {
			p = p*a;
		}
		return p;
	}
	
	public static int countdig(int a) {
		int cnt=0;
		while(a>0) {
			cnt++;
			a = a/10;
		}
		return cnt;
	}
	
	public static boolean isDisarium(int num) {
		int original = num;
		int length = countdig(num);
		int sum =0;
		while(num>0) {
			int digit=num%10;
			sum +=power(digit,length);
			length--;
			num = num/10;
		}
		
		if(original==sum) return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        if (isDisarium(n))
	            System.out.println(n + " is a Disarium Number");
	        else
	            System.out.println(n + " is not a Disarium Number");

	        sc.close();

	}

}
