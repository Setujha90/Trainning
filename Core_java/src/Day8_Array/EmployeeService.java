package Day8_Array;

public interface EmployeeService {
	
	Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary);
	
	double calculateAverageSalary(Employee[] employees);
	
	Employee getTopPaidEmployee(Employee[] employees);
	
	Employee[] getExperiencedEmployees(Employee[] employees, double minYears);
	
	Employee getTopPaidEmployeeByDepartment(Employee[] employees,String department);
	
	double getAverageSalaryByDepartment(Employee[] employees,String department);
	
	public static void main(String[] args) {
		int n =4;
		Employee [] employees = new Employee[4];
		
		
			employees[0]= new Employee(2,"Setu",45.0,"backend",7);
			employees[1]= new Employee(2,"Akash",452.0,"Fronted",10);
			employees[2]= new Employee(2,"Vishal",445.0,"Testing",4);
			employees[3]= new Employee(2,"Ashish",402.0,"Fronted",9);
			
			EmployeeService service = new EmployeeSurviceImp();
			double m = service.calculateAverageSalary(employees);
			System.out.println("AvgSalary: "+m);
			Employee [ ] high = service.getHighSalaryEmployees(employees, 67);
			for(Employee e : high) {
				if(e!=null)System.out.println(e.name);
			}
			
			Employee maxi  =service.getTopPaidEmployee(employees);
			System.out.println("TopPaidEmployee: "+maxi.name);
			
			Employee [] exp = service.getExperiencedEmployees(employees, 5);
			for(Employee e : exp) {
				if(e!=null) System.out.println(e.name); 
			}
			
			double avgsaldept = service.getAverageSalaryByDepartment(employees, "Fronted");
			System.out.println("AvgSalByDept: "+avgsaldept);
			
			Employee toppaiddept = service.getTopPaidEmployeeByDepartment(employees, "Fronted");
			System.out.println("TopPaidEmployeeByDepartement: "+toppaiddept.name);
			
		
	}
	

}

class EmployeeSurviceImp implements EmployeeService{
	public Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary) {
		
		Employee [] highsal = new Employee [employees.length];
		int count=0;
		for(int i =0;i<employees.length;i++) {
			if(employees[i].sal>=minSalary) {
			//	System.out.println(employees[i].sal);
				
				highsal[count++]= employees[i];
			}
		}
		return highsal;
	}
	
	public double calculateAverageSalary(Employee[] employees) {
		int n = employees.length;
		double sum =0.0;
		for(Employee it:employees) {
			sum +=it.sal;
		}
		return sum/n;
	}
	
	public Employee getTopPaidEmployee(Employee[] employees) {
		int n = employees.length;
		
		double maxi = Double.MIN_VALUE;
		Employee ans = null ;
		for(Employee it:employees) {
		   if (it.sal>maxi) {
			   maxi = it.sal;
			   ans = it;
		   }
		}
		return ans;
	}
	
public Employee[] getExperiencedEmployees(Employee[] employees, double minYears) {
		
		Employee [] expemp = new Employee [employees.length];
		int count=0;
		for(int i =0;i<employees.length;i++) {
			if(employees[i].experience>=minYears) {
			//	System.out.println(employees[i].experience);
				
				expemp[count++]= employees[i];
			}
		}
		return expemp;
	}

public double getAverageSalaryByDepartment(Employee[] employees,String department) {
	int n = employees.length;
	double sum =0.0;
	int count=0;
	for(Employee it:employees) {
		if(it.department==department) {
			sum +=it.sal;
			count++;
			
		}
	}
	return sum/count;
}

public Employee getTopPaidEmployeeByDepartment(Employee[] employees,String department) {
	int n = employees.length;
	
	double maxi = Double.MIN_VALUE;
	Employee ans = null ;
	for(Employee it:employees) {
	  if(it.department==department) {
		  
	   if (it.sal>maxi) {
		   maxi = it.sal;
		   ans = it;
	   }
	}
	}
	return ans;
}

}
