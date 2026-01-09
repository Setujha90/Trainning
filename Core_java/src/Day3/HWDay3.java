package Day3;
import  java.util.*;

public class HWDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//increament decreament
		int a =5;
		int b =10;
		a +=2;
		b /=2;
		a= a++ + --a + --a + --a + b++ + b--;
		b=b++ + a-- + a++ + ++b;
		System.out.println(a);
		System.out.println(b);
		
		//CONDITIONAL OPERATOR
		
		//use conditional operator and check which number is smaller between two number
		int x=3;
		int y =6;
		System.out.println(x<y?"x is smaller":"y is smaller");
		
		//write a program to find given month number is valid or not
		int month =13;
		System.out.println((month>=1 && month <=12)?"Valid":"Not Valid");
		
		//write a program to find given integer is single digit or double digit also check for -ve number
		
		int n =45;

        int num = (n < 0) ? -n : n;  

        String result =
                (num <= 9)
                ? "Single digit"
                : (num <= 99)
                    ? "Double digit number"
                    : "More than double digit number";

        System.out.println(result);
        
        //write a program to check given number is divisible by 3 and 5 or not
        int number=30;
        String ans = ((number%3==0) && (number%5==0))?"Number is divisible by 3 and 5":"Number is not divisible by 3 and 5";
        System.out.println(ans);
        
        
        //IF ELSE
        //write a program to check given character is capital alphabet or small alphabet
        char ch = 'N';
        if(ch>='A'&&ch<='Z') System.out.println("Capital");
        else if(ch>='a'&&ch<='z') System.out.println("Small");
        else System.out.println("Not an alphabet");
        
        //write a program to convert small alphabet to large alphabet and small alphabet to large
        char c = 'g';
        if(c>='A'&&c<='Z') c = (char)(c+32);
        else if(c>='a'&&c<='z') c= (char)(c-32);
        else System.out.println("Not an alphabet");
        System.out.println(c);
        
        
        //LOOP
        //write a program to print odd number from n1 to n2
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        
        while(n1<=n2) {
        	if(n1%2==1) System.out.println(n1);
        	n1++;
        }
        
        //Count how many digit,how many even and odd digit,how many zero,average of digit present in the number
        int no =4574;
        int count =0;
        int evencount=0;
        int oddcount=0;
        int zerocount=0;
        int sum =0;
        while(no>0){
        	int digit = no%10;
        	sum += digit;
        	if(digit==0) zerocount++;
        	if(digit%2==0) evencount++;
        	else {
        		oddcount++;
        	}
        	no = no/10;
        	count++;
        	
        }
        System.out.println(count);
        System.out.println(evencount);
        System.out.println(oddcount);
        System.out.println(zerocount);
        int avg = sum/count;
        System.out.println("Avg: "+avg);

        //write a program to check palidrome number
        int pali=121;
        int original = pali;
        int reverse = 0;

        while (pali > 0) {
            int digit = pali % 10;
            reverse = reverse * 10 + digit;
            pali = pali / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
        
        
	}

}
