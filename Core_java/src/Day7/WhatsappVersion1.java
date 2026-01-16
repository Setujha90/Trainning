package Day7;

public class WhatsappVersion1 {
	
	public void chat() {
		System.out.println("You can chat now");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhatsappVersion1 w1 = new WhatsappVersion1();
		WhatsappVersion2 w2 = new WhatsappVersion2();
		WhatsappVersion3 w3 = new WhatsappVersion3();
		
		w1.chat();
		w2.chat();
		w2.status();
		w3.chat();
		w3.status();
		w3.metaai();
		

	}

}

 class WhatsappVersion2 extends WhatsappVersion1{
	public void status() {
		System.out.println("You can add your status now");
	}
}

class WhatsappVersion3 extends WhatsappVersion2{
	public void metaai() {
		System.out.println("You can connect with metaai now");
	}
}
