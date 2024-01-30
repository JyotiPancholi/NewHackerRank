package com.day21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result7 {

    public static int maxMin(int k, List<Integer> arr) {
    	 Collections.sort(arr);

         int minUnfairness = Integer.MAX_VALUE;
         for (int i = 0; i <= arr.size() - k; i++) {
             int currentUnfairness = arr.get(i + k - 1) - arr.get(i);
             if (currentUnfairness < minUnfairness) {
                 minUnfairness = currentUnfairness;
             }
         }

         return minUnfairness;
    }
}
public class MaxMin {

	public static void main(String[] args) {
		System.out.println(Result7.maxMin(2, Arrays.asList(1,4,7,2)));
	}
}
