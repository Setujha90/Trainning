package Day6;


public class HelpLaptop {
	
	public static Laptop getLaptop() {
		return new Laptop();
	}
	
	public static Laptop getLaptop(String brand,double price) {   //here Laptop return type is object
		return new Laptop(brand,price);
	}
	
	public static Laptop verifyPrice(String brand,double price) {
		if(price>=10000.0 && price<=500000.0) {
			return new Laptop(brand,price);
		}
		return null;
	}

	

}
