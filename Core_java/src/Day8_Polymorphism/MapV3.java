package Day8_Polymorphism;

public class MapV3 extends MapV2{
	
	public void bookCab() {
		System.out.println("Book the cab");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapV3 m3 = new MapV3();
		m3.bookCab();
		m3.routes();
	    
		System.out.println();
		
		MapV2 m2 = new MapV2();
		m2.routes();
		
		System.out.println();
		
		MapV1 m1=new MapV1();
		m1.routes();
		
		System.out.println();
		
		MapV1 m4 = new MapV3();
		m4.routes();
		
		MapV3 v3  =(MapV3)m4;
		v3.bookCab();
		v3.routes();
		
		MapV2 v2 =(MapV2)m4; // we can downcast to the intermiadate class between child and parent also it will not give any error
		v2.routes();
		
		System.out.println();
		
		MapV2 m5=new MapV3();
		m5.routes();
		
		System.out.println();
		
		MapV1 m6=new MapV2();
		m6.routes();
		
//		MapV3 m7 = (MapV3)m6; //error thrown
//		m7.routes();

	}

}
