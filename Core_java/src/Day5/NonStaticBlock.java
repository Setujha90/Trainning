package Day5;

public class NonStaticBlock {
	
	 {
		System.out.println("S1");
	}
	
	 {
		System.out.println("S2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main start");
		NonStaticBlock e1 = new NonStaticBlock();
		System.out.println("Main end");

	}

}
