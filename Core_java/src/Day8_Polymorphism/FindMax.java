package Day8_Polymorphism;

public class FindMax {
	
	public int max(int a , int b) {
		return a>b?a:b;
	}
	
	public int max(int a , int b,int c) {
		return a>b?a>c?a:c:b>c?b:c;
	}
	
	public float max(int a , float b) {
		return a>b?a:b;
	}
	
	public float max(float a , float b) {
		return a>b?a:b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMax f = new FindMax();
		System.out.println(f.max(2,4,1));

	}

}
