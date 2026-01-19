package Day9_abstraction;

public class Cricket extends Game {
	
	public void start() {
		System.out.println("Cricket Start");
	}
	
	public void end() {
		System.out.println("Cricket End");
	}

}

 class Football extends Game {
	
	public void start() {
		System.out.println("Football Start");
	}
	
	public void end() {
		System.out.println("Fotball End");
	}

}
