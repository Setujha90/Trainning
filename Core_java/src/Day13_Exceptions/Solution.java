package Day13_Exceptions;


class UnauthorizedAccessException extends RuntimeException {
 public UnauthorizedAccessException(String message) {
     super(message);
 }
}


class InvalidSalaryException extends Exception {
 public InvalidSalaryException(String message) {
     super(message);
 }
}
    

interface Payroll {
 double calculateSalary();
}


abstract class Employee implements Payroll {
 private int employeeId;
 private String name;
 private String role;
 private double salary;

 public Employee(int employeeId, String name, String role) {
     this.employeeId = employeeId;
     this.name = name;
     this.role = role;
 }



 public int getEmployeeId() {
	return employeeId;
}



 public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
 }



 public String getName() {
	return name;
 }



 public void setName(String name) {
	this.name = name;
 }



 public String getRole() {
	return role;
 }



 public void setRole(String role) {
	this.role = role;
 }



 public void setSalary(String requesterRole, double salary)
         throws InvalidSalaryException {

     if (!requesterRole.equalsIgnoreCase("HR")) {
         throw new UnauthorizedAccessException(
                 "Only HR can modify salary");
     }

     if (salary <= 0) {
         throw new InvalidSalaryException("Salary must be greater than zero");
     }
     this.salary = salary;
 }

 public double getSalary() {
     return salary;
 }
}


class FullTimeEmployee extends Employee {

 public FullTimeEmployee(int id, String name) {
     super(id, name, "Full-Time");
 }

 @Override
 public double calculateSalary() {
     return getSalary();
 }
}

class ContractEmployee extends Employee {
 private int hoursWorked;
 private double Rate;

 public ContractEmployee(int id, String name,
                         int hoursWorked, double Rate) {
     super(id, name, "Contract");
     this.hoursWorked = hoursWorked;
     this.Rate = Rate;
 }

 
 @Override
 public double calculateSalary() {
     return hoursWorked * Rate;
 }


}


public class Solution {
 public static void main(String[] args) {

     try {
         Employee emp1 = new FullTimeEmployee(101, "Rahul");
         Employee emp2 = new ContractEmployee(102, "Aman", 160, 300);

         emp1.setSalary("HR", 50000);
         emp2.setSalary("HR", emp2.calculateSalary());

         System.out.println("Full-Time Salary: " + emp1.calculateSalary());
         System.out.println("Contract Salary: " + emp2.calculateSalary());

         emp1.setSalary("Employee", 60000);

     } catch (InvalidSalaryException e) {
         System.out.println("Give salary greater than zero");
     } catch (UnauthorizedAccessException e) {
         System.out.println("You don't have access");
     }
 }
}
