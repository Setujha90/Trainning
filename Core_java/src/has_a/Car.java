package has_a;

public class Car {
	
	private int id;
	private String color;
	private String brand;
	
	private Engine e;
	
	public int getId() {
		return this.id;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setId(int id) {
		 this.id=id;
	}
	
	public void setBrand(String brand) {
		 this.brand=brand;
	}
	

	public void setColor(String color) {
		 this.color=color;
	}
	
	public Engine getEngine() {
		return this.e;
	}
	
//	public void setEngine(int cc,String type) {
//		this.e.setCc(cc);
//		this.e.setType(type);
//		
//	}
	
	public void setEngine(Engine e) {
		this.e=e;
	
		
	}
	

}
