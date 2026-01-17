package Day8_Polymorphism;

public class Child extends Parent {
	@Override
	public Child m3() { //return type change from Parent to CHild in this case we can do changes in the return type
		return null;
	}
	
	@Override
	public void home() {
		System.out.println("red");
	}
	
	public static void home2() {
		System.out.println("Child static method");
	}
	public void bike() {
		System.out.println("BMW");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		p.home();
		p.home2();
		Child c = new Child();
		c.home();
		c.home2();
		Parent p1= new Child();
		p1.home();
		p.home2(); //Here method overriding not happening in static case , method hiding is happening and returning parent method

	}

}
