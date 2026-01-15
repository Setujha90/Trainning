package Day6Oops;

public class Trainer {
	private int id;
	private String name;
	private int password;
	
	public int getPass() {
		return password;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setDetails(int id,String name,int password) {
		this.id=id;
		this.name=name;
		this.password=password;
	}
	
	public Trainer() {
		
	}
	
	public Trainer(int id,String name,int password) {
		this.id=id;
		this.name = name;
		this.password = password;
	}
}
