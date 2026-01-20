package Day10_Abstraction;

public interface Vehicle {
	
	void price();
	void type();

}

class Car implements Vehicle{
	public void price() {
		System.out.println(200000);
	}
	
	public void type() {
		System.out.println("Electric");
	}
}

class Bike implements Vehicle{
	public void price() {
		System.out.println(10000);
	}
	
	public void type() {
		System.out.println("Petrol");
	}
}
