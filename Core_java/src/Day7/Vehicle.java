package Day7;

//Example of typecasting (upcast and downcast)
public class Vehicle {
	
    public void travel(){
    	System.out.println("Travelling");
    }
    
    public static void getVehicle(Vehicle v) {
    	if(v instanceof Bike) {
    		Bike b= (Bike)v;
    		b.topSpeed();
    	}
    	
    	else if(v instanceof Car) {
    		Car c =(Car)v;
    		c.noofWheel();
    	}
    	else {
    		Train t = (Train)v;
    		t.ticketPrice();
    	}
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Vehicle v = new Vehicle();
//		v.travel();
//		Car c = new Car();
//		c.noofWheel();
//		c.travel();
//		Bike b = new Bike();
		//b.topSpeed();
//		Train t=new Train();
//		t.ticketPrice();
//		
//		Vehicle c1= new Car();
//		c1.travel();
//		
//		Vehicle b1= new Bike();
//		b1.travel();
//		Bike b2=(Bike)b1;
//		b2.topSpeed();
	//	Train t2 = (Train)c1; //classcastexception
		
		
		Bike b5 = new Bike();
		Car c5 = new Car();
		Train t5= new Train();
		
		getVehicle(b5);
		getVehicle(c5);
		getVehicle(t5);
		
		
		

	}
	
}
	class Bike extends Vehicle{
		
		
		public void topSpeed() {
			System.out.println("Topspeed");
		}
		
		
	}
	
	class Car extends Vehicle{
	
		
		public void noofWheel() {
			System.out.println("Total 4 wheel");
		}
		
		
	}
	
	class Train extends Vehicle{
		
		public void ticketPrice(){
			System.out.println("Very high");
			
			
			
		}
	}


