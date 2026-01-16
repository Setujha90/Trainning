package Day7;

public class Mobile extends Product {
	
	int price;
	String SIM;
	int a =20;
	
	public Mobile(String brand,int price,String SIM) {
		super(brand);
		this.price=price;
		this.SIM=SIM;
	}
	
	public void printdetails() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(SIM);
		System.out.println(a);
		System.out.println(super.a); // super keyword is word to access the parent class variable same we can done with method
		System.out.println(this); // store the address of the object
		super.m1();
		this.m1(); //for now it is calling from parent ,but m1() method exist in child then this will give child method
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m = new Mobile("Nokiea",1000,"Jio");
		m.printdetails();

	}

}
