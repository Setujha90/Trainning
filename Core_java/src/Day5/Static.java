package Day5;

public class Static {
	
	static int a =10;
	static int b ;
	static String pm ="modi";
	static String c;
	
	public static void e() {
		int a=5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(pm);
		System.out.println(c);
		System.out.println(Static.a);//use the classname if static variable and local variable have same name and we want to access the static variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		e();
		System.out.println(Vararg.name); //accessing the static variable from different class(agr package different rha to package ko import krke access kr skte h )

	}

}
