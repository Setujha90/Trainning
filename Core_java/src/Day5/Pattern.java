package Day5;

public class Pattern {
	
	public static void p1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void p3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void p2(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			}
		
	}
	
	public static void p4(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n-i+1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1(5);
		p2(5);
		p3(5);
		p4(5);

	}

}
