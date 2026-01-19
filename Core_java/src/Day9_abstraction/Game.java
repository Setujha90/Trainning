package Day9_abstraction;

public abstract class Game {
	
	public abstract void start();
	public abstract void end();
	
	public void play() {
		start();
		end();
	}
	
	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.play();
		
		Football f = new Football();
		f.play();
	}
	

}
