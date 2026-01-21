package Day11_Object_Class;


public class Person {
	
	String name;
	int id;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() { 
		return "id: " +id+" name: "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person(10,"xyz");
		System.out.println(p.toString());

	}
}
