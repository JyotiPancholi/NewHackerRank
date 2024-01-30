package com.day21;

class Result6 {

    public static String counterGame(long n) {
    	 int counter = 0;
         while (n > 1) {
             if ((n & (n - 1)) == 0) {
                 n /= 2;
             } else {
                 long powerOf2 = 1;
                 while (powerOf2 * 2 <= n) {
                     powerOf2 *= 2;
                 }
                 n -= powerOf2;
             }
             counter++;
         }
         if (counter % 2 == 0) {
             return "Richard";
         } else {
             return "Louise";
         }
    }
}
public class CounterGame {

	public static void main(String[] args) {
		System.out.println(Result6.counterGame(6));
	}
}
