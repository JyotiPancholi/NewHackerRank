package com.day15;

class Result2 {
    public static int findDigits(int n) {
//    	int count =0 ;
//    	while (n!=0) {
//    		 int digit = n%10;
//			if (digit!=0 && n%digit ==0) {
//				count++;
//			}
//			n/=10;
//		}
//    	return count;
    	
    	String number = String.valueOf(n);
        int sum = 0;

        char[] digits = number.toCharArray();

        for (int i = 0; i < number.length(); i++) {
            if (Character.getNumericValue(digits[i]) != 0) {
                if ((n % Character.getNumericValue(digits[i])) == 0) {
                    sum++;
                }
            }
        }

        return sum;
    }
}

public class FindDigits {

	public static void main(String[] args) {
       System.out.println(Result2.findDigits(1012));
	}
}
