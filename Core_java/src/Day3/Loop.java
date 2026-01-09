package Day3;


public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print 1 to n using while loop 
	int i =1;
	int n =20;
		while(i<=n) {
//			System.out.println(i+" ");
			i++;
		}
		
		int k =1;
		int l=7;
		
		// print 1 to n using do while loop
		
		do {
//			System.out.print(k+ " ");
			k++;
		}while(k<=l);
		
		System.out.println();
	
		
		// print m to 1
	int m =20;
	int j =1;
	while(j<=m) {
//		if(j%2==0) System.out.println(j);
		j++;
	}
	
	
	// find sum from 1 to n 
	int sum =0;
	int o=1;
	while(o<=n) {
		sum +=o;
		o++;
	}
	System.out.println(sum);

	
	//find sum of digit in the number
	int temp =123;
	int sumd =0;
	while(temp>0) {
		int dig = temp%10;
		sumd += dig;
		temp = temp/10;
	}
	
	System.out.println(sumd);
	
	
	int num =30;
	int countt=0;
	for(int e =1;e*e<=num;e++) {
		
		if (num%e==0) countt+=1;
		if(e != num/e) countt++;
		
	}
	System.out.println(countt);
	
	
}

}
