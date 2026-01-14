package Day5;

public class Student {
	
	int id;
	String name;
	public void study() {
		
		System.out.println(id); //directly accessing the non static variable inside non static context
		System.out.println("study");
	}
	
	public void m1() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.id);
		System.out.println(s.name);
		
		s.id=10;
		s.name="Setu";
		System.out.println(s.id);
		System.out.println(s);
		s.study();
		

	}

}
