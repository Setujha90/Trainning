package Day5;

public class Vararg {
	
	static String name ="SETU";
	
	public static void maxi(double ...d) {
		double maxii=Double.MIN_VALUE;
		for(double i:d) {
			if(i>maxii) {
				maxii=i;
			}
		}
		System.out.println("Maximum value is: "+maxii);
	}
	
	public static void conca(String ...s) {
		String str="";
		for(String i:s) {
			str=str+i;
		}
		System.out.println(str);
	}
	
	public static void add(String s,int ...n) {
		int sum=0;
		System.out.println(n.length);
		for(int i:n) {
			sum =sum+i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add("sds");
		add("ssdvsv",4,5,3,7);
		
		conca("setu","kumar","jha");
		maxi(4.5,2.5,6.9);
		

	}

}
