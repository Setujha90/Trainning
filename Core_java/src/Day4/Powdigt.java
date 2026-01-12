package Day4;

public class Powdigt {
	
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
	
	public static boolean isarm(int a) {
		
		int count = countdig(a);
		int sum =0;
		
		int temp=a;
		
		while(temp>0) {
			int dig =temp%10;
			sum +=power(dig,count);
			temp= temp/10;
		}
		if(sum == a) return true;
		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(power(2,5));
		System.out.println(countdig(15));
		if(isarm(1634)) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not a armstrong");
		}

	}

}
