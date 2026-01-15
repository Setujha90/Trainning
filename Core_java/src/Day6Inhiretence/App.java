package Day6Inhiretence;

public class App {
	 String name;
	 double version;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Whatsapp w = new Whatsapp("Busniess",2.0,"8287009496","setukrjha");
		w.printDetails();

	}
	
	

}

class Whatsapp extends App{
	String phonenumber;
	String username;
	
	Whatsapp(String name,double version,String phonenumber,String username){
		this.name=name;
		this.version=version;
		this.phonenumber=phonenumber;
		this.username=username;
		
	}
	
	 public void printDetails() {
	    	System.out.println(name);
			System.out.println(version);
			System.out.println(phonenumber);
			System.out.println(username);
	    }
}
