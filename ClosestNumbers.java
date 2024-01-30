package com.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result2 {

    public static List<Integer> closestNumbers(List<Integer> arr) {
    	 Collections.sort(arr);
         List<Integer> closestPairs = new ArrayList<>();
         int minDiff = Integer.MAX_VALUE;

         for (int i = 1; i < arr.size(); i++) {
             int diff = Math.abs(arr.get(i) - arr.get(i - 1));

             if (diff < minDiff) {
                 minDiff = diff;
                 closestPairs.clear();
                 closestPairs.add(arr.get(i - 1));
                 closestPairs.add(arr.get(i));
             } else if (diff == minDiff) {
                 closestPairs.add(arr.get(i - 1));
                 closestPairs.add(arr.get(i));
             }
         }

         return closestPairs;
    }
}
public class ClosestNumbers {

	public static void main(String[] args) {
		System.out.println(Result2.closestNumbers(Arrays.asList(5,2,3,1,4)));
	}
}
