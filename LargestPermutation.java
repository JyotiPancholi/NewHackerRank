package com.day19;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result4 {
    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
    	 Map<Integer, Integer> indexMap = new HashMap<>();

         for (int i = 0; i < arr.size(); i++) {
             indexMap.put(arr.get(i), i);
         }

         for (int i = 0; i < arr.size() && k > 0; i++) {
             if (arr.get(i) != arr.size() - i) {
                 int maxVal = arr.size() - i;
                 int currentVal = arr.get(i);
                 int maxValIndex = indexMap.get(maxVal);

                 arr.set(i, maxVal);
                 arr.set(maxValIndex, currentVal);

                 indexMap.put(currentVal, maxValIndex);
                 indexMap.put(maxVal, i);

                 k--;
             }
         }

         return arr;

    }

}

public class LargestPermutation {

	public static void main(String[] args) {
		System.out.println(Result4.largestPermutation(1, Arrays.asList(4, 2, 3, 5, 1)));

	}

}
