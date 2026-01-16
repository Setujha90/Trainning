package Day6Assignment;

//Example of hirachacy
public class Vehicle {
	
	String color;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b = new Bike("honda","black",80000.0);
		b.printVehicle();
		
		Car c = new Car("audi","red",5000000.0);
		c.printVehicle();
		
		Vehicle v = new Vehicle();
		v.color="Green";
		System.out.println(v.color);

	}
	
}
	class Bike extends Vehicle{
		String brand;
		double price;
		
		Bike(String brand,String color,double price){
			this.brand=brand;
			this.color=color;
			this.price=price;
		}
		
		public void printVehicle() {
			System.out.println(brand);
			System.out.println(color);
			System.out.println(price);
		}
		
		
	}
	
	class Car extends Vehicle{
		String brand;
		double price;
		
		Car(String brand,String color,double price){
			this.brand=brand;
			this.color=color;
			this.price=price;
		}
		
		public void printVehicle() {
			System.out.println(brand);
			System.out.println(color);
			System.out.println(price);
		}
		
	}

