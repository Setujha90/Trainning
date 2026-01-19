package Day8Assignment;
import java.util.*;

public class Array {
	
	//1.Write a program to print the element the element Array
	
	public static void printArray(int [] arr) {
		System.out.println("--------array element-----");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	//2.Write a program to print even index elements of an Array
	
	public static void printEvenIndex(int [] arr) {
		System.out.println("--------Even index array element-----");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	//3.Write a program to print odd index elements of an Array
	
		public static void printOddIndex(int [] arr) {
			System.out.println("--------Odd index array element-----");
			for(int i=0;i<arr.length;i++) {
				if(i%2==1) {
					System.out.println(arr[i]);
				}
			}
		}
		
		//4.Write a program to print the sum of elements of an Array
		
			public static void sumOfElement(int [] arr) {
				System.out.println("--------Sum of array element-----");
				int sum =0;
				for(int i=0;i<arr.length;i++) {
					sum +=arr[i];
				}
				System.out.println(sum);
			}	
			
			//5.Write a program to print the product of elements of an Array
			
			public static void productOfElement(int [] arr) {
				System.out.println("--------Product of array element-----");
				int prod =0;
				for(int i=0;i<arr.length;i++) {
					prod *=arr[i];
				}
				System.out.println(prod);
			}
			
			//6. Write a program to reverse the array without using new Array
			public static void reverseArray(int [] arr) {
				
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
				printArray(arr);
				
				
			}
			
			//7. Write a program to print the copyarray
			public static void copyArray(int [] arr) {
				int [] copyArray = arr;
				
				System.out.println("Copying the array");
				printArray(copyArray);
				
				
			}
			
			//8. write a program to reverse the array using new array
			public static void revNewArray(int [] arr) {
				int [] rev = new int[arr.length];
				for(int i =0;i<arr.length;i++) {
					rev[i]=arr[arr.length-i-1];
				}
				
				System.out.println("Reverse array");
				printArray(rev);
			}
			
			//9. write a program to find largest element in a array
			public static int LarElement(int [] arr) {
				int maxi = arr[0];
				for(int i =1;i<arr.length;i++) {
					if(arr[i]>maxi) {
						maxi = arr[i];
					}
				}
				
				return maxi;
			}
			
			//10. write a program to find secord largest element in a array
			public static int secLarElement(int [] arr) {
				int maxi = LarElement(arr);
				int secondmaxi = Integer.MIN_VALUE;
				for(int i =1;i<arr.length;i++) {
					if(arr[i]>secondmaxi && arr[i]!=maxi) {
						secondmaxi = arr[i];
					}
				}
				
				return secondmaxi;
			}
	
			//11.Write a program to print the freuency of occurarence of element
			public static void eachelefreq(int[] a) {

			    Arrays.sort(a);

			    int p = a[0];
			    int count = 1;

			    for (int i = 1; i < a.length; i++) {

			        if (a[i] == p) {
			            count++;
			        } else {
			            System.out.println(p + " -> " + count);
			            p = a[i];
			            count = 1;
			        }
			    }

			    // print last element frequency
			    System.out.println(p + " -> " + count);
			}
			
		//12.	write a program to print the dublicate element of the array
			public static void printDublicate(int[] arr) {

			    for (int i = 0; i < arr.length; i++) {

			        if (arr[i] == -1)
			            continue;

			        int count = 1;

			        for (int j = i + 1; j < arr.length; j++) {
			            if (arr[i] == arr[j]) {
			                count++;
			                arr[j] = -1;
			            }
			        }

			       if(count>1) System.out.println(arr[i] );
			    }
			}
			
			// 13.remove dublicate element
			
			//14. unique element
			public static void uniqueElement(int[] arr) {

			    for (int i = 0; i < arr.length; i++) {

			        if (arr[i] == -1)
			            continue;

			        int count = 1;

			        for (int j = i + 1; j < arr.length; j++) {
			            if (arr[i] == arr[j]) {
			                count++;
			                arr[j] = -1;
			            }
			        }

			        System.out.println(arr[i] );
			    }
			}
			
			//15. prime number in a given array
			//16. print fibonacci elment in a given array
			public static boolean isFibonacci(int num) {

			    if (num < 0)
			        return false;

			    int a = 0, b = 1;

			    if (num == 0 || num == 1)
			        return true;

			    int c = a + b;

			    while (c <= num) {
			        if (c == num)
			            return true;

			        a = b;
			        b = c;
			        c = a + b;
			    }

			    return false;
			}
			
			public static void printFibonacciElements(int[] arr) {

			    for (int i = 0; i < arr.length; i++) {

			        if (isFibonacci(arr[i])) {
			            System.out.print(arr[i] + " ");
			        }
			    }
			}
			
			//17. write a program to insert element at given index
			public static int[] insertElementInIndex(int [] arr, int ele,int index) {
				int n = arr.length;
				
//				  if (index < 0 || index > n) {
//				        System.out.println("Invalid index");
//				        return arr;
//				    }
				int [] ans = new int [n+1];
				
				int i =0;
				int j =0;
				while(i!=index) {
					ans[j++] = arr[i++];
				}
				ans[j++] = ele;
				while(i<n) {
					ans[j++]=arr[i++];
				}
				
				return ans;
			}
			
			//18. remove element from particular index
			
			//19. print right rotate array
			public static void reverse(int[] arr, int start, int end) {

			    while (start < end) {
			        int temp = arr[start];
			        arr[start] = arr[end];
			        arr[end] = temp;
			        start++;
			        end--;
			    }
			}

			public static void rightRotate(int[] arr, int k) {

			    int n = arr.length;
			    k = k % n;

			    reverse(arr, 0, n - 1);
			    reverse(arr, 0, k - 1);
			    reverse(arr, k, n - 1);

			    for (int x : arr)
			        System.out.print(x + " ");
			}
			
			//20. left rotate
			
			//21. sort the element of the array
			
			//22.write a program to print the nth largest element of the array
			public class NthLargest {

			    public static void printNthLargest(int[] arr, int n) {

			        if (n <= 0 || n > arr.length) {
			            System.out.println("Invalid value of n");
			            return;
			        }

			        for (int i = 1; i < n; i++) {
			            int max = arr[0];
			            int index = 0;

			            for (int j = 1; j < arr.length; j++) {
			                if (arr[j] > max) {
			                    max = arr[j];
			                    index = j;
			                }
			            }
			            arr[index] = Integer.MIN_VALUE;
			        }

			        int max = arr[0];
			        for (int i = 1; i < arr.length; i++) {
			            if (arr[i] > max)
			                max = arr[i];
			        }

			        System.out.println(n + "th largest element is: " + max);
			    }
			}

			//23. print duplicate prime element of an array
			
			// 24. write a program for linear search
			// 25. write a program for binary search
			// 26. write a program for bubble sort
			//27. write a program to print first and last character of an array
			//28. merge two array in a array
			public static int [] mergetwoarray(int []a,int []b) {
				int n1=a.length;
				int n2=b.length;
				int [] ans = new int [n1+n2];
				
					int count =0;
					int i=0;
					int j=0;
					
					
					while(i<n1) {
						ans[count++]=a[i++];
					}
					while(j<n2) {
						ans[count++]=b[j++];
					}
				
				return ans;
			}
			//29.merge two array in a zigzag manner in a array
			public static int [] zigzag(int []a,int []b) {
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
			
			//30.write a program to print all pairs of element sum equal to targeted value of an array.
		    public static void printPairs(int[] arr, int target) {

		        Arrays.sort(arr);

		        int left = 0;
		        int right = arr.length - 1;
		        boolean found = false;

		        while (left < right) {

		            int sum = arr[left] + arr[right];

		            if (sum == target) {
		                System.out.println(arr[left] + " " + arr[right]);
		                left++;
		                right--;
		                found = true;
		            } 
		            else if (sum < target) {
		                left++;
		            } 
		            else {
		                right--;
		            }
		        }

		        if (!found)
		            System.out.println("No pairs found");
		    }


			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int [] a = new int[n];
		
		System.out.println("Enter array element");
		
		for(int i =0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
//		printArray(a);
//		printEvenIndex(a);
//		printOddIndex(a);
//		sumOfElement(a);
//		productOfElement(a);
//		reverseArray(a);
	//	copyArray(a);
		//revNewArray(a);
		//System.out.println("Max element: "+LarElement(a));
		//System.out.println("Second Max element: "+secLarElement(a));
	  // eachelefreq(a);
		//printDublicate(a);
		//uniqueElement(a);

	}

}
