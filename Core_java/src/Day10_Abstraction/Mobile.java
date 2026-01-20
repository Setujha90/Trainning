package Day10_Abstraction;

public interface Mobile {
	
	 void camera();
	 void battery();


}

class Redmi1 implements Mobile{
	public void camera() {
		System.out.println(" Redmi1 Camera");
	}
	
	public void battery() {
		System.out.println(" Redmi1 Battery");
	}
}

class Redmi2 implements Mobile{
	public void camera() {
		System.out.println(" Redmi2 Camera");
	}
	
	public void battery() {
		System.out.println(" Redmi2 Battery");
	}
}