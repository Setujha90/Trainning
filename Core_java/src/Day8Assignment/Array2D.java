package Day8Assignment;

import java.util.Scanner;

public class Array2D {
	
	public static int [][] take2DMat(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row");
		int row = sc.nextInt();
		System.out.println("Enter number of column");
		int col = sc.nextInt();
		
		int [][] arr = new int[row][col];
		
		System.out.println("Enter your element");
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		return arr;
	}
	
	public static void findLarSmall(int [][] arr) {
		int maxi = Integer.MIN_VALUE;
		int mini = Integer.MAX_VALUE;
		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				if(arr[i][j]>maxi) {
					maxi = arr[i][j];
				}
				if(arr[i][j]<mini) {
					mini = arr[i][j];
				}
			}
		}
		System.out.println("Max element: "+maxi);
		System.out.println("Min element: "+mini);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row");
		int row = sc.nextInt();
		System.out.println("Enter number of column");
		int col = sc.nextInt();
		
		int [][] arr = new int[row][col];
		
		System.out.println("Enter your element");
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		int [][] arr2 = take2DMat();
		
		
		
		findLarSmall(arr);

	}

}
