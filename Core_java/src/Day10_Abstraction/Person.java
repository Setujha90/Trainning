package Day10_Abstraction;

public class Person {
    private Vehicle v;
    private Mobile m; //loose coupling as we are storing the object in the reference of parent so we can change the pass object according to our choice 
// if we store in the reference of child mean here Redmi1 r1, so we can only store the redmi1 type of object so it is strong relationship as we can't change the object only one type of object can be store
	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	public Mobile getM() {
		return m;
	}

	public void setM(Mobile m) {
		this.m = m;
	}
}
