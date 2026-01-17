package Day8_Array;

public class Insert {
	
	public static int[] insertElementInIndex(int [] arr, int ele,int index) {
		int n = arr.length;
		
//		  if (index < 0 || index > n) {
//		        System.out.println("Invalid index");
//		        return arr;
//		    }
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
	
    public static int[] replaceElementInIndex(int [] arr, int ele,int index) {
    	
    	arr[index]=ele;
    	return arr;
		
	}
    
    public static int[] removeElementInIndex(int [] arr, int index) {
    	int n = arr.length;
		int [] ans = new int [n-1];
		int count=0;
		 for(int i=0;i<n;i++) {
			 if(i!=index) {
				 ans[count++]=arr[i];
			 }
			
		 }
		
		return ans;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {12,4,3,7,8};
		int [] res = insertElementInIndex(a,7,1);
		Array.takeIntArray(res);

	}

}
