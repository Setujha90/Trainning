package Day7_has_a;

public class Trainner {
	
	private String name;
	private String subject;
	
	private Student st;
	
	public String getName() {
		return this.name;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void setName(String name) {
		 this.name=name;
	}
	
	public void setSubject(String subject) {
		 this.subject=subject;
	}
	
	public Student getStudent() {
		return this.st;
	}
	
	public void setStudent(Student st) {
		this.st=st;
		
	}

}
