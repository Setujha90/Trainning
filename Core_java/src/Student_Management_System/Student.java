package Student_Management_System;

public class Student extends Person{
	int rollNumber;
	char grade;
	
	Course c;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}
	

}
