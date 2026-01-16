package has_a;

public class CarEngineDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.setId(12);
		c.setColor("Black");
		c.setBrand("Audi");
		
		Engine e = new Engine();
	    e.setCc(150);
	    e.setType("fuel type");
	    
	    c.setEngine(e);
	    
	    System.out.println(c.getId());
	    System.out.println(c.getColor());
	    System.out.println(c.getBrand());
	    System.out.println(c.getEngine().getCc());
	    System.out.println(c.getEngine().getType());

	}

}
