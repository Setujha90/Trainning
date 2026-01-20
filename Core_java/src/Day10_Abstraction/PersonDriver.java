package Day10_Abstraction;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setV(new Car());
		p.setV(new Bike());  // loose coupling (weak has a relationship)
		
	
		Vehicle v2=p.getV();
		v2.type();
		v2.price();
		
		p.setM(new Redmi1());
		p.setM(new Redmi2()); //loose coupling
		
		p.getM().battery();
		p.getM().camera();
		
		
		Vehicle v1=HelpVehicle.getVehicle(); //(upcasting) real abstraction hiding the details we didn't know which child object we are creating
		v1.price();
		v1.type();
		
		

	}

}
