package Day5;

public class Laptop {
	
	String brand;
	double price;
	
	public Laptop(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
	
	public String comp(Laptop l) {
		return this.price>l.price?this.brand:l.brand;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop("hp",70000.0);
		Laptop l2 = new Laptop("acer",60000.0);
		
		String res = l1.comp(l2);
		System.out.println(res);

	}

}
