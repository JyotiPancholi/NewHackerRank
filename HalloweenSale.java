package com.day12;

class Result3 {

    public static int howManyGames(int p, int d, int m, int s) {
    	 int count = 0;
         while (s >= p) {
        	 count++;
             s -= p;
             p = Math.max(p - d, m);
         }
         return count;
    }
}

public class HalloweenSale {

	public static void main(String[] args) {
		System.out.println(Result3.howManyGames(20, 3, 6, 85));
	}
}
