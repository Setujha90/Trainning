package Day10_Abstraction;

public interface Test {
	
	public static final int a=30;
	int b =45;
	static int c = 2; // all variable are by default public static final so we need to give value and we can't change its value
	
	private void m1() { // non static method
		System.out.println("private method");
	}
	
	default void m2() { // it is also a not static method
		System.out.println("default method"); //default method are different from default access modifier , it helps child to not implement this default method the error not throw 
	}
	
	public static void m3() {
		System.out.println("Static method");
	}
	
	public static void main(String[] args) {
		
	}

}
