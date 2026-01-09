package Day3;

public class Conditional {
	
	public static void main(String[] args) {
		
	
	int a =95;
	int b=58;
	int c=10;
	int d =80;
	//By if else
	if(a>b && a>c) System.out.println(a);
	else {
		if(b>c) System.out.println(b);
		else System.out.println(c);
	 }
	
	int big =a;
	if(b>big) {
		big=b;
	}
	if(c>big) big =c;
	if(d>big) big =d;
	System.out.println(big);
	
	
	//given character is alphabet , digit, special character ******
	 char ch = '1';
	if((ch>='A' && c<='Z') || (ch>='a' && ch<='z') ) System.out.println("Alphabet");
	else if((ch>='0' && c<='9') || (ch>='a' && ch<='z') ) System.out.println("Digit");
	else  System.out.println("Special char");
	
	switch(2)
	{
	 case 1:{
		
	 	System.out.println("c1");
	 }
	
		
	case 2:{
		
		System.out.println("c2");
		break;
	}
		
	default:{
		
		System.out.println("c3");
	}
	
	
	}
	
	int w =9;
	int y =3;
	char op = '+';
	
	switch(op) {
	case '+':{
		System.out.println(w+y);
		break;
	}
	case '-':{
		System.out.println(w-y);
		break;
	}
	case '*':{
		System.out.println(w*y);
		break;
	}
	case '/':{
		System.out.println(w/y);
		break;
	}
	default:{
		System.out.println("No match");
	}
	
	}
	
	
	String day = "Satruday";
	int z=4;
	
	switch(day) {
	
	case "Monday": z=1;
	break;
	case "Tuesday": z=1;
	break;
	case "Wednesday": z=1;
	break;
	case "Thurday": z=2;
	break;
	case "Friday": z=3;
	break;
	case "Satruday": z=2;
	break;
	case "default": z=0;
	}
	
	if(z==0) System.out.println("Enjoy");
	if(z==1) System.out.println("English");
	if(z==2) System.out.println("Java");
	if(z==3) System.out.println("SQL");
	

	}
}
