package Day7_has_a;

public class Person {
	
	String name;
	
	PanCard panCard; //store the object 
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name="setu";
		PanCard card = new PanCard();
		card.panId="ABFJC";
		card.dob="14/43/333";
		
		p.panCard=card;
		
		System.out.println(p.name);
		System.out.println(p.panCard.panId);
		System.out.println(p.panCard.dob);
		
	}

}
