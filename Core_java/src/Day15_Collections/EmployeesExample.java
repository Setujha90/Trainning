package Day15_Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeesExample  implements Comparator<Employee>{
	
	
	public int compare(Employee s1, Employee s2) {
		return s1.id -s2.id; //asc
//		return s2.id - s1.id; //des
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(new Employee(2,"seti"));
		a1.add(new Employee(1,"setu"));

		
//		Collections.sort(a1,(s1,s2)->s1.id-s2.id); //by using lambda function
		Collections.sort(a1,new EmployeesExample());
		System.out.println(a1);
		for(Employee e:a1) {
			System.out.println(e.id);
		}
	}

}

class Employee{
	int id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
}
