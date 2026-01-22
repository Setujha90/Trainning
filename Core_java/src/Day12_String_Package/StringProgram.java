package Day12_String_Package;

public class StringProgram {
	
	public static void countAlpha() {
		String s ="abc12";
		int count =0;
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void toLotoUppString() {
		String s = "aBc12";
		
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A'&&ch<='Z' ) {
				System.out.print((char)(ch+32));
			}
			else if(ch>='a'&&ch<='z') {
				System.out.print((char)(ch-32));
			}
			else {
				System.out.print(ch);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//	toLotoUppString();
		
		String s2 = "hi java java hii";
		System.out.println(s2.indexOf("hii")); // give first character index of word or string
		System.out.println(s2.indexOf("java", 4));

	}

}
