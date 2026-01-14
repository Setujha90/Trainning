package Day5;

public class College {
	
	String name;
	String location ;
	
	public void exam() {
		System.out.println(name +" is taking exam");
	}
	
	public void printCollege() {
		System.out.println("Name: "+name);
		System.out.println("Location: "+location);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College c1 = new College();
		c1.name="IEM";
		c1.location="College More";
		
		System.out.println(c1.name);
		System.out.println(c1.location);
		c1.exam();
		c1.printCollege();

	}

}
