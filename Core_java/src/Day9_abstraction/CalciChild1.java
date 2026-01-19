package Day9_abstraction;

public class CalciChild1 extends Calculator {
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	@Override
	public int multi(int a , int b) {
		return a*b;
	}
	
	public int sub(int a, int b) {
		super.sub(3, 1);
		System.out.println("Child sub");
		return a-b;
	}
	
	public static void main(String [] args) {
		Calculator c  = new CalciChild1();
		int sum = c.add(2, 3);
		
		System.out.println(sum);
		c.sub(6, 2);
	}

}
