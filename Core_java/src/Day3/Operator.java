package Day3;

public class Operator {
		static int x =20;
	
	public static void main(String[] args) {
		int a =5;
		int b=58;
		int c=10;
		int d =30;
		//largest number between 3 number
		System.out.println((a<b)?"a is smaller and "+"a: "+ a:"b is smaller and:"+"b: "+b);
		
		String lar = (a>b) ? ((a>c) ? "a is largest" :"c is largest"): (c>b)?"c is largest":"b is largest";
		System.out.println(lar);
		
		//largest number between 4 number
		int big = a>b?a:b;
		big = big>c ? big:c;
		big = big>d ? big : d;
		System.out.println(big);
		
		int x =10;
		System.out.println(x);
		
		
	
	}

}
