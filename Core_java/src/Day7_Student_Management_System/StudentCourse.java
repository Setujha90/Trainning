package Day7_Student_Management_System;

public class StudentCourse {
	
	public static void showStudentCourseDetails(Student s) {
		System.out.println(s.getAge());
		System.out.println(s.getGrade());
		System.out.println(s.getName());
		System.out.println(s.getRollNumber());
		System.out.println(s.getC().getCourseId());
		System.out.println(s.getC().getCourseName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.setAge(21);
		s.setName("Setu");
		s.setRollNumber(30);
		s.setGrade('O');
		
		
		Course c = new Course();
		c.setCourseId(12);
		c.setCourseName("Btech");
		
		s.setC(c);
		
		showStudentCourseDetails(s);
		
		

	}

}
