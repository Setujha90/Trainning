package Day12_String_Package;

import java.util.Arrays;

public class Program {
	
	
	
	public static void removeDigit() {
		String s = "Abcd1c2";
		String res = "";
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='0' && c<='9') {
				continue;
			}
			res +=c;
		}
		System.out.println(res);
	}
	
	public static void countaldigisepc() {
		
		String s = "AbcsEH1%$@7";
		int alph =0;
		int dig =0;
		int spcha=0;
		
		for(int i =0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z') {
				alph++;
			}
			else if(ch>='0' && ch<='9') {
			   dig++;
			}
			else {
				spcha++;
			}
		}
		System.out.println("Alphabet: "+alph+" Digit: "+dig+" Special Character: "+spcha);
		
		
	}
	
	public static void toUppercase(char c) {
		if(c>='a'&&c<='z') {
			c = (char)(c-32);
		}
	}
	
	public static void toUpCase() {
		String s ="Hello my name is setu";
		String ans ="" ;
		
		 char prev = ' ';
		 for(int i=0;i<s.length();i++) {
			 char ch = s.charAt(i);
			 if(prev ==' ') {
				 if(ch>='a'&&ch<='z') {
					 ans += (char)(ch-32);
				 }
				 else {
					 ans += ch;
				 }
			 }
			 else {
				 ans +=ch;
			 }
			 prev =ch;
		 }
		 
		 System.out.println(ans);
		
	}
	
	public static void toLowCase() {
		String s = "HELLO MY NAME IS SETU";
		String res ="";
		String [] st = s.split(" ");
		for(int i =0;i<st.length;i++) {
			String a = st[i];
			char c = a.charAt(a.length()-1);
			if(c>='A'&&c<='Z') {
				res +=a.substring(0,a.length()-1);
				res += (char)(c+32);
			}
			else {
				res +=a;
			}
			res +=" ";
		}
		System.out.println(res);
	}
	
	public static void swapfirstlast() {
		 String s = "Hello my a name setu";
		 String [] st = s.split(" ");
		 String res ="";
		 for(int i =0;i<st.length;i++) {
			 char start = st[i].charAt(0);
			 char end = st[i].charAt(st[i].length()-1);
			 res +=end;
			 if(st[i].length()>1) {
				 res +=st[i].substring(1, st[i].length()-1);
				 res +=start;
			 }
			 res +=" ";
		 }
		 System.out.println(res);
	}
	
	public static void removeSpace() {
		String s = "Hel lo my nam  e is setu";
		String res = s.replaceAll(" ", "");
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//removeDigit();
	//	countaldigisepc();
		//toUpCase();
		
//		String s ="Hello my name is setu";
//		//System.out.println(s.contains("namei"));
//		
//		String [] str = s.split(" ");
//		for(int i =0;i<str.length;i++) {
//			System.out.println(str[i]);
//		}
//		
//		String s1="java";
//		String s2="JAVA";
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.startsWith("jav"));
		
		//toLowCase();
		
		StringBuffer s1 = new StringBuffer("xyz");
		StringBuffer s2 = new StringBuffer("xyz");
		
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
//	
//		String s = new String(s1); //converting SB->String
//		
//		StringBuffer s3 = new StringBuffer(s); //converting String->SB
//		
		StringBuilder s4 =new StringBuilder("abc");
		System.out.println(s4);
		
		StringBuffer s5 = new StringBuffer("srgfgyhjhjhkjhgghgfffgffghhfhgdrrr"); //16 is default capacity to store the number of character
		System.out.println(s5.capacity());
//		
//		s4.insert(1,"setu");
//		System.out.println(s4);
//		
//		StringBuffer s6 = new StringBuffer("abcdef");
//		s6.delete(0, 2); //2 is excluded
//		System.out.println(s6);
//		
//		StringBuffer s7 = new StringBuffer("setukumar");
//		s7.replace(0, 2, "jhajii");
//		System.out.println(s7);
//		
//		StringBuilder sb = new StringBuilder("Hello World");
////		char[] charArray = new char[sb.length()];
////		sb.getChars(0, sb.length(), charArray, 0); //converting string builder to char array
////		StringBuilder stringBuilder = new StringBuilder(String.valueOf(charArray)); //converting char array to string builder
////	
//		
//		
//		//DOUBT
////		String res=" " ;
////		String st = "";
////		for(int i =0;i<sb.length();i++) {
////			char c = sb.charAt(i);
////			if(c==' ' || i==s.length()-1) {
////				res +=st;
////				st ="";
////			}
////			else {
////				st += c;
////			}
////	
////		}
////		
////		System.out.println(res);
////		
//		
//		
//		char [] c = {'a','c','b'};
//		Arrays.sort(c);
//		System.out.println(Arrays.toString(c)); //converting each character of array to string????????
		
		//swapfirstlast();
	//	removeSpace();

	}

}
