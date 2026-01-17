package Day8_Array;
import java.util.*;

public class Array2D {
	
	public static int[] RowWiseSum(int [][]arr,int row,int col) {
		int [] ans = new int [row];
		int k =0;
		
		for(int i =0;i<row;i++) {
			int sum=0;
			for(int j =0;j<col;j++) {
			  sum +=arr[i][j];
			}
			ans[k++]=sum;
		}
		return ans;
	}
	
//	public static int[] ColWiseSum(int [][]arr,int row,int col) {
//		int [] ans = new int [row];
//		
//		for(int i =0;i<row;i++) {
//			int sum=0;
//			for(int j =0;j<col;j++) {
//			  if(arr[i][j]%2==0) {
//				  System.out.println(arr[i][j]+" present at "+i+""+j);
//			  }
//			}
//			System.out.println();
//		}
//		return ans;
//	}

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
		
//		for(int i =0;i<row;i++) {
//			for(int j =0;j<col;j++) {
//			  if(arr[i][j]%2==0) {
//				  System.out.println(arr[i][j]+" present at "+i+""+j);
//			  }
//			}
//			System.out.println();
//		}
		
		int [] res = RowWiseSum(arr,row,col);
		Array.takeIntArray(res);

	}

}
