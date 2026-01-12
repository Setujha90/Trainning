package Day4;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your name");
		String Name = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter your phoneno");
		long phone_no = sc.nextLong();
		System.out.println("Enter your email");
		String email = sc.next();
		System.out.println("Enter your gender");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your status");
		boolean marriage = sc.nextBoolean();
		System.out.println("Enter your weight");
		float weight = sc.nextFloat();
		System.out.println(Name);
		System.out.println(age);
		System.out.println(phone_no);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(marriage);
		System.out.println(weight);
		
		sc.close();


		 
		 

		 



		

	}

}
