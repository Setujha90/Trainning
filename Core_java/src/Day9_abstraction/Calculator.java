package Day9_abstraction;

public abstract class Calculator {
	
	public abstract int add(int a , int b) ;
	
	public abstract int multi(int a , int b);
	
	public int sub(int a,int b) {
		System.out.println("Parent");
		return a-b;
	}

}
