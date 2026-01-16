package has_a;

public class College {
	private String name;
	private String location;
	private Student s;
	private Trainner t;
	
	public String getName() {
		return this.name;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void setName(String name) {
		 this.name=name;
	}
	
	public void setLocation(String location) {
		 this.location=location;
	}
	
	public Student getStudent() {
		return this.s;
	}
	
	public void setStudent(Student s) {
		this.s=s;
		
	}
	
	public Trainner getTrainner() {
		return this.t;
	}
	
	public void setTrainner(Trainner t) {
		this.t=t;
		
	}
	
	

	
	public void printdetails() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(t.getSubject());
		System.out.println(t.getName());
		//System.out.println(t.getStudent().getId());
		//System.out.println(t.getStudent().getName());
	}
	

}
