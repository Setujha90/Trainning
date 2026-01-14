package Day5Assignment;

public class Car {
	
	String brand;
	int speed;
	
	void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		    Car c1 = new Car();  
	        c1.brand = "BMW";
	        c1.speed = 120;

	        Car c2 = new Car();  
	        c2.brand = "Audi";
	        c2.speed = 140;

	        c1.drive();
	        c2.drive();
		

	}

}
