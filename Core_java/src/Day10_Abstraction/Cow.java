package Day10_Abstraction;

public class Cow implements Animal {
	public void sound() {
		System.out.println("Cow Bark");
	}
	
	public void color() {
		System.out.println("Cow color is Black");
	}
	
	public static void main(String[] args) {
		Cow c = new Cow();
		c.sound();
		
		Animal a = new Dog();
		a.color();
		
		Dog d = (Dog) a;
		d.sound();
		
		Lion l = new Lion();
		l.color();
		
		Lion l1 = (Lion)a; //ClassCastException given
		
	}
}
