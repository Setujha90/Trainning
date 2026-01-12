package Day4;

public class Method {
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public static void mul(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void div(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void mod(int a, int b) {
		System.out.println(a%b);
	}
	public static void gresmall(int a, int b, int c) {
		System.out.println((a>b&&a>c)?"a: "+a +"is greatest":(b>c)?"b: " +b +" is greatest":"c: "+ c + "is greatest");
		System.out.println((a<b&&a<c)?"a: "+a+" is smallest":(b<c)?"b:" +b+ "is smallest":"c: "+c + " is smalltest");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(20,10);
		sub(20,10);
		mul(2,3);
		div(4,2);
		mod(5,2);
		gresmall(3,5,1);
		
		

	}

}
