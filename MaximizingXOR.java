package com.day17;

class Result10 {
    public static int maximizingXor(int l, int r) {
    	 int maxXOR = 0;

         for (int A = l; A <= r; A++) {
             for (int B = A; B <= r; B++) {
                 int currentXOR = A ^ B;
                 if (currentXOR > maxXOR) {
                     maxXOR = currentXOR;
                 }
             }
         }

         return maxXOR;
    }
}

public class MaximizingXOR {

	public static void main(String[] args) {
		System.out.println(Result10.maximizingXor(11,100));
	}
}
