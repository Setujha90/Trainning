package Day8_Array;
import java.util.*;

public class Array {
	
	public static void takeIntArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int[] arr = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextInt()	;
		}
		
		int sum=0;
		System.out.println("--------array element-----");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			sum +=arr[i];
		}
		System.out.println(sum);
		
		sc.close();
	}
	
	public static void takeFloatArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		float [] arr = new float [sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextFloat();
		}
		
		System.out.println("--------array element-----");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
	public static void takeCharArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		char[] arr = new char[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.next().charAt(0)	;
		}
		
		System.out.println("--------array element-----");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
	public static void takeStringArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		String[] arr = new String[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.next();
		}
		
		System.out.println("--------array element-----");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
	public static void takeBooleanArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		boolean [] arr = new boolean[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextBoolean();
		}
		
		System.out.println("--------array element-----");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
	public static void takeIntArray(int[] arr) {
//		System.out.println("--------array element-----");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void takeFloatArray(float [] arr) {
		System.out.println("--------array element-----");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] evennumber(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		int [] ans = new int[count];
		
		System.out.println("Even element are");
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			    ans[j]=arr[i];
				j++;
			}
		}
		
		return ans;
		
	}
	
	public static void rev(int [] arr) {
		
		int i =0;
		int j =arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		System.out.println("Reversing the array");
		
	}
	
	public static void sumdigitrep(int [] arr) {
		for(int i =0;i<arr.length;i++) {
			int num=arr[i];
			int sum =0;
			while(num>0) {
				int dig = num%10;
				sum += dig;
				num =num/10;
			}
			arr[i]=sum;
		}
		System.out.println("Replacing element with sum of its digit");
	}
	
	//Doubt 
	public static int [] mergetwoarray(int []a,int []b) {
		int n1=a.length;
		int n2=b.length;
		int [] ans = new int [n1+n2];
		
			int count =0;
			int i=0;
			int j=0;
			while(i<n1 && j<n2) {
				ans[count++]=a[i++];
				ans[count++]=b[j++];
				
			}
			
			while(i<n1) {
				ans[count++]=a[i++];
			}
			while(j<n2) {
				ans[count++]=b[j++];
			}
		
		return ans;
	}
	
	public static int [] larsmall(int []a) {
		int ans [] = new int [2];
		
		int maxi=Integer.MIN_VALUE;
		int mini = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>maxi) {
				maxi=a[i];
			}
			if(a[i]<mini) {
				mini=a[i];
			}
			
		}
		
		ans[0]=maxi;
		ans[1]=mini;
		return ans;
		
	}
	
	public static int [] mergetwosortedarray(int [] a, int [] b) {
		int n = a.length;
		int m = b.length;
		
		int i=0;
		int j=0;
		int [] res = new int [n+m];
		int k=0;
		
		while(i<n && j<m) {
			if(a[i]<b[j]) {
				res[k++]=a[i++];
			}
			else {
				res[k++]=b[j++];
			}
		}
		
		while(i<n) {
			res[k++]=a[i++];
		}
		while(j<m) {
			res[k++]=b[j++];
		}
		
		return res;
	}
	
	public static void eachelefreq(int [ ]a) {
		Arrays.sort(a);
		int p = a[0];
		int count=1;
		for(int i=1;i<a.length;i++) {
			if(a[i]==p) {
				count++;
			
			}
			else {
				System.out.println(p);
				p=a[i];
				count=1;
				continue;
			}
			
		}
		System.out.println(a[a.length-1]
				);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//takeFloatArray();
		//takeStringArray();
//		takeBooleanArray();
	//	takeIntArray();
//		takeCharArray();
//		int [] a = new int[3];
//		System.out.println(a.length);
//		
//		a[0]=12;
//		a[1]=9;
//		a[2]=1;
//		int sumeven =0;
//		int sumodd =0;
//		for(int i =0;i<a.length;i++) {
//		//	System.out.println(a[i]);
//		  if(a[i]%2==0) sumeven += a[i];
//		  else sumodd += a[i];
//		}
//		 System.out.println(sumeven);
//		 System.out.println(sumodd);
//		
//		char [] c= new char[2];
//		float [] f= new float[3];
//		String [] s = new String[2];
//		boolean [] b = new boolean[3];
//		
//		c[0]='a';
//		c[1]='b';
//		
//		for(int i =0;i<c.length;i++) {
//			System.out.println(c[i]);
//		}
		
//		int [] x = {12,34,1};
//		float [] y = {11.4f,3.5f,1.1f};
//		takeIntArray(x);
//		takeFloatArray(y);
		
//		int [] z = {12,3,5,7,9,8,4};
		//int [] res=evennumber(z);
		
	//	takeIntArray(res);
//		rev(z);
//		takeIntArray(z);
//		sumdigitrep(z);
		
//		int [] m = {2,9};
//		int [] res = larsmall(z);
//		
//		takeIntArray(res);
		
		int [] a = {1,4,5};
		int [] b = {2,3,8,78,12};
		int [] res = mergetwoarray(a,b);
//		takeIntArray(res);
//		
//		int [] ans = mergetwosortedarray(a,b);
//		takeIntArray(ans);
////		
/// 
//     int [] a = {10,10,3,2,4,4,10};
//     
//		eachelefreq(a);
		
		int [] z = new int[4];
		Object o = new int[5];
		System.out.println(o.toString());
		System.out.println(z.getClass());
		
 
	}

}
