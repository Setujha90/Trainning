package Day7;

public class Employee extends Human{
	int id;
	double salary;
	
	public Employee(int id,double salary,String name,int age,char gender) {
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(1,750000.0,"Setu",21,'M');
		System.out.println(e.id);
		System.out.println(e.salary);
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.gender);
	}

}
