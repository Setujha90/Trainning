package Day9_abstraction;

public class Redmi3 extends Redmi2 {
	
   @Override
	public void smartCamera() {
		System.out.println("SmartCamera");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Redmi3 r3 = new Redmi3();
		r3.smartCamera();
		r3.battery();
		r3.camera();
		
		System.out.println();
		Redmi2 r2 =  new Redmi3();
		r2.smartCamera();
		r2.battery();
		r2.camera();
		
		System.out.println();
		Redmi1 r1 = new Redmi3();
		r1.battery();
		r1.camera();
		
		System.out.println();
		Redmi3 x = (Redmi3)r1;
		x.smartCamera();
		x.battery();
		x.camera();
		
		System.out.println();
		Mobile m = new Redmi3();
		m.battery();
		m.camera();
		

	}

}
