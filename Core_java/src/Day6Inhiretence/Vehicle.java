package Day6Inhiretence;

public class Vehicle {
	
	String brand;
	String color;
	double price;
	
	public void printVehicle() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
	
   public static void main(String[] args) { // we need to write main method here as file name is vehicle
	   Bike b = new Bike("BMW","black",150);
	   b.printVehicle();
	   
	   Vehicle v = new Vehicle();
	   v.brand="honda";
	   v.color="red";
	   v.price=88787.0;
	   v.printVehicle();
	   	
	}

}

class Bike extends Vehicle{
	
	Bike(String brand,String color,double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
}
