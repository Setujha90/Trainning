package Day5;

public class Program {
	
	public static void checkpali(int pali) {
		

		  int original = pali;
	        int reverse = 0;

	        while (pali > 0) {
	            int digit = pali % 10;
	            reverse = reverse * 10 + digit;
	            pali = pali / 10;
	        }

	        if (original == reverse) {
	            System.out.println("Palindrome number");
	        } else {
	            System.out.println("Not a palindrome number");
	        }
	}
	
	public static void checkprime(int num) {
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				System.out.println("Not a prime number");
				return;
			}
		}
		System.out.println("Prime number");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
