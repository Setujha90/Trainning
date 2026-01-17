package Day8_Polymorphism;

//Method overloading

public class Math {
	
	
	public static void add(int a , int b) {
		System.out.println("Two int type of data");
		System.out.println(a+b);
	}
	
	public static void add(int a , int b,int c) {
		System.out.println("Three int type of data");
		System.out.println(a+b+c);
	}
	
	public static void add(float a , float b) {
		System.out.println("Two float type of data");
		System.out.println(a+b);
	}
	
	public static void add(double a , double b,double c) {
		System.out.println("Three double type of data");
		System.out.println(a+b+c);
	}
	
	public static double add(int a , int b,double c, double d) {
		System.out.println("Two int and two double type of data");
		return a+b+c+d;
	}
	
	public void add(int a,double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		add(2,3);
		add(2,3,5);
		add(2.0f,3.7f);
		add(2.8,3.5,5.6);
		System.out.println(add(2,7,4.5,3.4));
		Math m = new Math();
		m.add(2, 3.6);
	}

}
