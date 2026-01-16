package Day7;

public class Child extends Parent {
	
	long phone;
	
	public Child(String name,long phone) {
		super(name);
		this.phone=phone;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child("XYZ",888);
		System.out.println(c.name);
		System.out.println(c.phone);

	}

}
