package com.day14;

class Result9 {

    public static long sumXor(long n) {
    	
    	int count = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n >>= 1;
        }

        long result = (long) Math.pow(2, count);
        return result;
        
        //code was correct but getting timeout error 
//    	int count =0;
//    	for (int i = 0; i <=n; i++) {
//			if ((n+i)==(n^i)) {
//			   count++;	
//			}
//		}
//    	return count;
    }
}
public class Sum_vs_XOR {

	public static void main(String[] args) {
		System.out.println(Result9.sumXor(4));
	}

}
