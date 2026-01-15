package Day6;

public class Laptop {
	
	String brand;
	double price;
	
	public Laptop() { // constructor behave same like non static method
		System.out.println(t); //satic value can be access directly
		System.out.println(s); //in non ststic method non static can be directly access by name
		System.out.println(a1);
		System.out.println(this.a1);
		System.out.println(a2);
	}
	
	
	public Laptop(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
	
	public String comp(Laptop l) {
		return this.price>l.price?this.brand:l.brand;
	}
	
	int a1; //primitive datatype
	static int a2;
	Student s; //non primitive datatypes
	static Student t;
	//static Student t2=new Student(); //we can create here also
	
	
	public void m1() { //non static method
		System.out.println(t); //satic value can be access directly
		System.out.println(s); //in non ststic method non static can be directly access by name
		System.out.println(a1);
		System.out.println(this.a1);
		System.out.println(a2);
		System.out.println(this.s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l =HelpLaptop.getLaptop();
//		Laptop l1 = new Laptop("hp",70000.0);
		Laptop l1= HelpLaptop.getLaptop("dell", 440000.0);
		System.out.println(l1.brand);
		Laptop l2 = new Laptop("acer",60000.0);
		String res = l1.comp(l2);
		System.out.println(res+" is costly");
		Laptop l3 = HelpLaptop.verifyPrice("lenvo",80000.0);
		if(l3==null) System.out.println("you can't create object");
		else {
			System.out.println("Object created");
		}
		
		System.out.println(t); //satic value can be access directly
		System.out.println(l2.s); //accessing non static by creating object
		System.out.println(l1.a1);
		System.out.println(a2);
		l1.m1();
		

	}

}
