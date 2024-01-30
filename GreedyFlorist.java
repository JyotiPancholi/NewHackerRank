package com.day21;

import java.util.Arrays;

class Result8{
	static int getMinimumCost(int k, int[] c) {
		Arrays.sort(c);
        int n = c.length;
        int totalCost = 0;
        int purchaseCount = 0;

        for (int i = n - 1; i >= 0; i--) {
            int multiplier = (purchaseCount / k) + 1;
            totalCost += multiplier * c[i];
            purchaseCount++;
        }

        return totalCost;
    }
}
public class GreedyFlorist {

	public static void main(String[] args) {
		int k = 3;
        int[] c = {1, 2, 3, 4};
        System.out.println(Result8.getMinimumCost(k, c));
	}
}
