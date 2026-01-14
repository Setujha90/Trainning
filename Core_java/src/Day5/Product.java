package Day5;

public class Product {
	int id;
	String name;
	double price;
	int rating;
	
	public Product(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public Product(int id,String name,double price,int rating) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.rating=rating;
	}
	
	//Doubt if static how can we access non static variable
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(rating);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1= new Product(2,"bat");
		p1.display();
		Product p2= new Product(1,"Ball",45.0);
		p2.display();
		Product p3=new Product(5,"Shoes",100.0,4);
		p3.display();
		

	}

}
