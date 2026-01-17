package Day8_Polymorphism;

//Constructor overloading
public class Employee {
	
	int id;
	String name;
	double salary;
	String dept;
	
	Employee(){
		
	}
	
	Employee(int id){
		this.id=id;
	}
	
	Employee(int id,String name){
		this(id);
		this.name=name;
	}
	
	Employee(int id,String name,double salary){
		this(id,name);
		this.salary=salary;
	}
	
	Employee(int id,String name,double salary,String dept){
		this(id,name,salary);
		this.dept=dept;
	}
	
	public void printdetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(dept);
	}
	
	public static void main(String[] args) {
		Employee e= new Employee();
		Employee e1= new Employee(2);
		Employee e2= new Employee(2,"setu");
		Employee e3= new Employee(4,"setu",67.9);
		Employee e4= new Employee(6,"setu",89.4,"java");
		
		e4.printdetails();
	}

}
