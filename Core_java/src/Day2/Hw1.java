package Day2;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 10-15 High Level Language
		
		/*
		 * Python
		 *java
		 *cpp
		 *c#
		 *javascript
		 *typescript
		 *php
		 *ruby
		 *swift
		 *kotlin
		 *go(golang)
		 *R
		 *Matlab
		 *Dart
		 *Scala
		  */
		
		//Create datatype for name, phone no.,gender,marriage status,age,weights and also print;
		
		String name = "Setu Kumar";
		long phone_no = 8287009496L;
		char gender = 'M';
		boolean ismarried = false;
		int age = 22;
		float weight = 74.5f;
		System.out.println(name.getClass().getSimpleName()); //as string is non primitive datatype else we need to use wrapper classes
		System.out.println(((Object)phone_no).getClass().getSimpleName());
		System.out.println(((Object)gender).getClass().getSimpleName());
		System.out.println(((Object)ismarried).getClass().getSimpleName());
		System.out.println(((Object)age).getClass().getSimpleName());
		System.out.println(((Object)weight).getClass().getSimpleName());
		
		
		// covert byte to float , float to int , int to char, char to int
		byte b = 3;
		float fi=b;
		System.out.println(fi);
		float f=3.2f;
		int a = (int)f;
		System.out.println(a);
		char c ='a';
		int i = c;
		float fii=4.5f;
		double d = fii;
		
		System.out.println(i);
		System.out.println(d);
		
		
		//examples of operators
		System.out.println("setu"+9);
		System.out.println(9+"setu");
		System.out.println("setu"+'a');
		int e=3;
		System.out.println(e *=2);
		System.out.println(3>5);
		System.out.println(5!=1);
		System.out.println(3<4 && 4<5);
		System.out.println(3>4 || 3>5);
		

	}

}
