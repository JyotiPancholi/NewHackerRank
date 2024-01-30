package com.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Result3 {
    public static List<Integer> stones(int n, int a, int b) {
    	 Set<Integer> set = new TreeSet<Integer>();
         set.add(0);

         for (int j = 1; j < n; j++) {
             Set<Integer> tree = new TreeSet<Integer>();
             for (int el : set) {
            	 tree.add(el + a);
            	 tree.add(el + b);
             }
             set = tree;
         }

         return new ArrayList<>(set);
		
//correct solution in one way ->
         
//    	List<Integer> possibleStones = new ArrayList<>();
//        int minDifference = Math.min(a, b);
//        int maxDifference = Math.max(a, b);
//
//        for (int i = 0; i < n; i++) {
//            int stoneValue = i * maxDifference + (n - 1 - i) * minDifference;
//            possibleStones.add(stoneValue);
//        }
//
//        return possibleStones;
    }
}

public class ManasaAndStones {

	public static void main(String[] args) {
		System.out.println(Result3.stones(3, 1, 2));
		System.out.println(Result3.stones(4, 10, 100));
	}
}
