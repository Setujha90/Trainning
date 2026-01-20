package Day10_Abstraction;

public class HelpVehicle {
	
	public static Vehicle getVehicle() {
		return new Bike(); //Upcasting
	}

}
