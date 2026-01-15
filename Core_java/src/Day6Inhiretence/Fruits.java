package Day6Inhiretence;

public class Fruits {
	String color;
	String name;
	
	public Fruits() {
		
	}
	
	public Fruits(String name,String color) {
		this.name=name;
		this.color=color;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a= new Apple("Kashmiri apple","Red",300); //child object
		a.printDetails();
		
		Fruits g = new Fruits("apple","Black");
		System.out.println(g.color);
		System.out.println(g.name);
		
		Fruits f = new Apple("Desi apple","Green",200);
		System.out.println(f.color);
		System.out.println(f.name);
		//System.out.println(f.price); //can't access
		

	}

}

class Apple extends Fruits{
	int price;

	Apple(String color,String name,int price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	 public void printDetails() {
	    	System.out.println(name);
			System.out.println(color);
			System.out.println(price);
	    }
}
