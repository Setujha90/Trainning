package Day12_String_Assignment;

public class StringQues {
	
	public static void commChar() {
		String a =  "abdega";
		String b = "cdgkhadfd";
		a = a.toLowerCase();
		b = b.toLowerCase();
	   char [] arr1=a.toCharArray();
	   char [] arr2 = b.toCharArray();
	  boolean [] count1=new boolean[256];
	  boolean [] count2=new boolean[256];
	   
	   for(int i=0;i<arr1.length;i++) {
		   count1[arr1[i]-'a']=true;;
	   }
	   
	   for(int i=0;i<arr2.length;i++) {
		   if(count1[arr2[i]-'a'] && !count2[arr2[i]-'a']) {
			   System.out.print(arr2[i]+" ");
			   count2[arr2[i]-'a']=true;
			   
		   }
	   }
	   
	}
	
	public static boolean isIsogram() {
		String s = "acde";
		s=s.toLowerCase();
		int [] count1 =new int[26];
		for(int i =0;i<s.length();i++) {
			int ch = s.charAt(i);
			count1[ch-'a']++;
		}
		
		for(int it:count1) {
			if(it>1) return false;
		}
		return true;
	}
	
	  public static boolean isBalanced(String s) {

	        int prevLength;

	        do {
	            prevLength = s.length();

	            s = s.replace("()", "");
	            s = s.replace("{}", "");
	            s = s.replace("[]", "");

	        } while (s.length() != prevLength);

	        return s.length() == 0;
	    }

	  
	  public static void comstr() {
			String s = "gaaacdeef";
			if(s.length()==0) {
				System.out.println("not possible");
				return;
			}
			char prev = s.charAt(0);
			String res ="";
			//res +=prev;
			int count=1;
			for(int i=1;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch==prev) {
					count++;
				}
				else {
					res += prev;
					res+=count;
					count=1;
					prev=ch;
				}
			}
			res +=prev;
			res +=count;
			System.out.println(res);
			
		}
	  
	  public static void maxvol() {
		  String s = "I love programming";
		  s = s.toLowerCase();
		  int maxi=0;
		  String [] st = s.split(" ");
		  String ans=null;
		  for(int i =0;i<st.length;i++) {
			  String t = st[i];
			  int count=0;
			  int temp =maxi;
			  for(int j=0;j<t.length();j++) {
				  char c=t.charAt(j);
				  
				  if(c=='a' || c=='e'|| c=='i' || c=='o' ||c=='u'){
					  count++;
				  }
			  }
			  maxi = Math.max(maxi,count);
			  if(temp!=maxi) ans=st[i];
			  
			  
		  }
		  System.out.println(ans);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//commChar();
//		boolean b = isIsogram();
//		System.out.println(b);
//		boolean bt = isBalanced("{({}[])}[");
//		System.out.println(bt);
//		comstr();
		maxvol();

	}
	
}
