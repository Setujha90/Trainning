package Day5;

public class StaticBlock {
	
	static {
		System.out.println("S1");
	}
	
	static {
		System.out.println("S2");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
	}
	
	static {
		System.out.println("S3");
	}

}
