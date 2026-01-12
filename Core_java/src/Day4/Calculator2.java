package Day4;

public class Calculator2 {
	
	public static int add(int a, int b) {
		return (a+b);
	}
	
	public static int sub(int a, int b) {
		 return (a-b);
	}
	
	public static int mul(int a, int b) {
		return (a*b);
	}
	
	public static double div(int a, int b) {
		return (a/b);
	}
	
	public static int mod(int a, int b) {
		return (a%b);
	}
	
	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
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


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = '%';
		
		switch(c) {
		case '+':{
			System.out.println(add(2,3));
			break;
		}
		case '-':{
			System.out.println(sub(5,3));
			break;
		}
		case '*':{
			System.out.println(mul(2,3));
			break;
		}
		case '/':{
			System.out.println(div(6,3));
			break;
		}
		case '%':{
			System.out.println(mod(5,3));
			break;
		}
		default:{
			System.out.println("No valid operation");
		}
		}
		
		//CHecking a number is prime or not
		int n=7;
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("Not a prime number");
				return ; //break the method if it is not prime number
			}
		}
		
		System.out.println("Prime number");
		if(isPrime(19)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
		
		System.out.println(power(2,5));
		System.out.println(countdig(15));

	}

}
