package Day6Inhiretence;

public class Animal {
    String name;
    String color;
    int numberofleg;
    
    public void printDetails() {
    	System.out.println(name);
		System.out.println(color);
		System.out.println(numberofleg);
    }
    
    public static void main(String[] args) {
		Dog d = new Dog("Sera","Black",4);
		d.printDetails();
	}

}

class Dog extends Animal{
	Dog(String name,String color,int numberofleg){
		this.name=name;
		this.color=color;
		this.numberofleg=numberofleg;
	}
}
