package Day5;
import java.util.*;

public class Employee {
	
	////Doubt
	
	int id;
	String name;
	double salary;
	
	public void work() {
		System.out.println(name+ " is working");
	}
	
	public void printEmployee() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	
	public Employee() {
		System.out.println("C1");
	}
	
	public Employee(int a) {
		this();
		System.out.println("C2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of employees: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline

	        Employee[] employees = new Employee[n];

	        for (int i = 0; i < n; i++) {

	            employees[i] = new Employee();

	            System.out.println("Enter details for Employee " + (i + 1));

	            System.out.print("Enter ID: ");
	            employees[i].id = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Name: ");
	            employees[i].name = sc.nextLine();

	            System.out.print("Enter Salary: ");
	            employees[i].salary = sc.nextDouble();
	            sc.nextLine();
	        }

	        System.out.println("\nEmployee Details:");
	        for (int i = 0; i < n; i++) {
	            employees[i].printEmployee();
	        }
	        
	        sc.close();
		
		//Employee e =new Employee(2);

	}

}
