package Day6Assignment;

//Example of multi-level inhirentence
public class Person {
	
	   String name;

	    void displayName() {
	        System.out.println("Name: " + name);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Manager m = new Manager();
		    m.name = "Setu";
	        m.empId = 101;
	        m.salary = 75000;
	        m.department = "IT";

	        m.displayName();
	        m.displayEmployee();
	        m.displayManager();

	}

}

class Employee extends Person {
    int empId;
    double salary;

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department: " + department);
    }
}
