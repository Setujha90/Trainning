package Day11_Access_Modifier;

public class HelpObject {
	
	public static void main(String[] args) {
		Singleton st = Singleton.getObject();
		Singleton set = Singleton.getObject();
		set.m1();
		
		if(st==set) {
			System.out.println("Both object are same");
		}
		
	}

}
