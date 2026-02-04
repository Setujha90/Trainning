package Day11_Object_Class;

import java.util.Objects;

public class Employees {
	
	int id;
	String name;
	double sal;
	String department;
	
	Employees(int id, String name, double sal,String department){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.department=department;
	}
	
	//@Override
//	public String toString() { 
//		return "id: " +id+" name: "+name;
//	}
	
	@Override
	public boolean equals(Object o) {  //Here we are using Object o because it is parent so we are doing upcasting so that any child object can be store inside this
		
		//address same
		if(this==o) {
			return true;
		}
		
		
		//null object or same class
		if(o==null ||o.getClass()!=this.getClass()) return false;
		Employees e = (Employees)o; //we are downcasting so that we can access the member of child (Employee)
		
		if(this.id==e.id && this.name==e.name) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		
		return Objects.hash(id,name);
	}
	
	public boolean compareHash(Employees e1) {
		
		if(Objects.hash(e1.department,e1.id,e1.name,e1.sal)==Objects.hash(this.department,this.id,this.name,this.sal)) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Employees e = new Employees(1,"Setu",2000000.0,"Backend");
		Employees e1 = new Employees(1,"Setu",2000000.0,"Backend");
		
		Employees e2=e;
		Employees e3=null;
		
		boolean flag =e1.compareHash(e);
		System.out.println(flag);
		System.out.println(e.toString());
		
		//System.out.println(e.equals(e2)); // compare the address of the objects
		
		System.out.println(e.equals(e1)); //override equal method to compare the contents
		//System.out.println(e.equals(e3)); //Give nullpointerexception as you cannot compare with null null.name give nullpointer exceptional
		
		
		Employees [] arr = new Employees[3];
		arr[0] = e;
		arr[1] = new Employees(2,"Se",7000000.0,"Back");
		arr[2] = new Employees(3,"Set",3000000.0,"Fronted");
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//System.out.println(e.hashCode()); //generate the unique code of the address of the object
		
		System.out.println(e.hashCode()); //generating the hash code based on id and name (overriding)
		System.out.println(e1.hashCode());
		
	}

}
