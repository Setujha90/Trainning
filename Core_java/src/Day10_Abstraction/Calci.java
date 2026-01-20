package Day10_Abstraction;

public interface Calci {
	
	public abstract void add (int a, int b);
	void multi(int a, int b) ; // public abstract is default added by interface if we didn't write it
	
	 abstract void sub(int a, int b); //BY default access modifier is always public 
	 
	// protected abstract void m3(); //CTE
	 // private abstract void m4(); //CTE

}
