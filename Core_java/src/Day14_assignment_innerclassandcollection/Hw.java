package Day14_assignment_innerclassandcollection;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	int id;
	String name;
	int marks;
	
	Student(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class Hw {
	
	
	public static void displayStudents(List<Student> students) {	
		for(Student s : students) {
			System.out.println("ID : " + s.id );
			System.out.println("Marks :" + s.marks );
			System.out.println(" Name : " + s.name  );
		}
	}
	
	public static void filterPassedStudents(List<Student> students, int passMarks) {	
		for(Student s : students) {
			if(s.marks >= passMarks) {
				System.out.println("ID : " + s.id + " " +  "Marks :" + s.marks  + " Name : " + s.name + " "  );
			}
		}
	}
	
	public static Student findTopper(List<Student> students) {
		
		Student topper = null;
		int max = -1;
		
		for(Student s : students) {
			if(s.marks > max) {
				topper = s;
			}
		}
		return topper;
	}
	
	public static void searchStudentByName(List<Student> students, String name) {
		
		boolean flag = false;
		for(Student s : students) {
			if(s.name.toLowerCase().trim() == name.toLowerCase().trim()) {
				flag = true;
				System.out.println("ID : " + s.id + " " +  "Marks :" + s.marks  + " Name : " + s.name + " "  );
				break;
			}
		}
		
		if(!flag) {
			System.out.println("No Match Found !");
		}
	}
	
	public static void countStudentsPassed(List<Student> students, int passMarks) {
		
		int passedCount = 0;
		int failedCount = 0;
		
		for(Student s : students) {
			
			if(s.marks >= passMarks) {
				passedCount++;
			}else {
				failedCount++;
			}
		}
		
		System.out.println("Students Passed :" + passedCount);
		System.out.println("Students Failed :" + failedCount);
	}
	

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		
		students.add(new Student(101,"Ashish Soni",82));
		students.add(new Student(102,"Setu Jha",100));
		students.add(new Student(103,"Anish Agarwal",88));
		students.add(new Student(104,"Shekhar Singh",62));
		students.add(new Student(105,"Prabhat Kumar",85));
		
		//displayStudents(students);	
	}

}
