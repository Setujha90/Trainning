package Day11_Access_Modifier;

public class DBDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBConn d1 = DBConn.getObject();
		System.out.println(d1);
		System.out.println(d1.toString()); //using toString() metho of object to print the address
		
		DBConn d2 = DBConn.getObject();
		System.out.println(d2);
		DBConn d3 = DBConn.getObject();
		System.out.println(d3);
		DBConn d4 = DBConn.getObject();
		System.out.println(d4);
		DBConn d5 = DBConn.getObject();
		System.out.println(d5);
		DBConn d6 = DBConn.getObject();
		System.out.println(d6);
		
		

	}

}
