package Day9_abstraction;

public abstract class Shape {
	
	public abstract void area();
	
	public void display() {
		area();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		c.display();
		
		Rectangle r = new Rectangle();
		r.display();

	}

}

class Circle extends Shape{
	
	public void area() {
		System.out.println("Circle area is 3.14*r*r");
	}
}

class Rectangle extends Shape{
	
	public void area() {
		System.out.println("Rectangle area is l*b");
	}
}
