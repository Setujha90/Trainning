package has_a;

public class CollegeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.setId(2);
		s.setName("Setu");
		
		Trainner t = new Trainner();
		t.setName("Santosh");
		t.setSubject("Math");
		t.setStudent(s); //giving student to trainnner HAS-A
		
		College c =  new College();
		c.setName("IEM");
		c.setLocation("Collegemore");
		c.setStudent(s);
		c.setTrainner(t);
		c.printdetails();

	}

}
