package Day8_Array;
import java.util.*;


//Doubt
public class StudentDriver {
	
	public static void printstudent(Student [] s) {
		for(Student st:s) {
			
		
		if(st!=null) {
			
		
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.marks);
		}
	}
	}
	
	public static Student[] pass(Student [ ] arr,double passingmarks) {
		
		Student [] passStud = new Student[arr.length];

   for(int i =0;i<arr.length;i++) {
	   if(arr[i].marks>=passingmarks) {
		   passStud[i] = arr[i];
	   }
   }
		
		return passStud;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student [] students = new Student[3];
//		students[0] = new Student(18,"Virat",100);
//		students[1] = new Student(45,"Rohit",80);
//		students[2] = new Student(7,"Dhoni",30);
//		
//		System.out.println(students); //give address of the array 
//		System.out.println(students[0]); // object1 address
//		System.out.println(students[0].name); //object1 name
//		
//		for(int i =0;i<students.length;i++) {
//			System.out.println(students[i].id);
//			System.out.println(students[i].name);
//		}
//		
//		for(Student it:students) {
//			System.out.println(it.id);
//			System.out.println(it.name);
//		}

		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the passing marks");
		 double passingmarks = sc.nextDouble();
		 
		 System.out.println("Number of object you want for students array");
		 int n = sc.nextInt();
		 
		 Student [] students = new Student[n];
		 
		 for(int i =0;i<n;i++) {
			 int x = i+1;
			 System.out.println("Enter the details of "+(i+1)+" object");
			 int id = sc.nextInt();
			 String name = sc.next();
			 double marks = sc.nextInt();
			 
			 students[i]=new Student(id,name,marks);
		 }
		 
		 Student [] passstudent= pass(students,passingmarks);
		 printstudent(passstudent);
	}

}
