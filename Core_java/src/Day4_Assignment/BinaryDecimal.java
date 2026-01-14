package Day4_Assignment;

public class BinaryDecimal {
	
	 public static String decimalToBinary(int num) {
	        if (num == 0) return "0";

	        String binary = "";
	        while (num > 0) {
	            binary = (num % 2) + binary;
	            num = num/ 2;
	        }
	        return binary;
	    }

	    
	   public static int binaryToDecimal(int num) {
	        int decimal = 0;
	        int base = 1;

	        while (num > 0) {
	            int lastDigit = num % 10;
	            decimal += lastDigit * base;
	            base =base*2;
	            num =num/10;
	        }
	        return decimal;
	    }

	   
	  public static String decimalToOctal(int num) {
	        if (num == 0) return "0";

	        String octal = "";
	        while (num > 0) {
	            octal = (num % 8) + octal;
	            num =num/8;
	        }
	        return octal;
	    }

	    
	    public static String decimalToHexadecimal(int num) {
	        if (num == 0) return "0";

	        char[] set = {'0','1','2','3','4','5','6','7','8','9',
	                         'A','B','C','D','E','F'};

	        String s = "";
	        while (num > 0) {
	            int rem = num % 16;
	            s = set[rem] + s;
	            num =num/ 16;
	        }
	        return s;
	    }

	
	    public static int countOneBits(int num) {
	        int count = 0;
	        while (num > 0) {
	            if (num % 2 == 1)
	                count++;
	            num =num/2;
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int decimal = 25;
        int binary = 11001;

        System.out.println("Decimal to Binary " + decimalToBinary(decimal));
        System.out.println("Binary to Decimal " + binaryToDecimal(binary));
        System.out.println("Decimal to Octal " + decimalToOctal(decimal));
        System.out.println("Decimal to Hexadecimal " + decimalToHexadecimal(decimal));
        System.out.println("Number of 1bits " + countOneBits(decimal));

	}

}
