package Day7_has_a;

public class Human {
	
	private Heart heart;
	private Address address;
	
	public Human(){
     heart = new Heart();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}

class Heart {
	public void pump() {
		System.out.println("Heart is pumping");
	}
}

class Address{
	public void location() {
		System.out.println("INDIA");
	}
}
