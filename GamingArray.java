package com.day21;

import java.util.Arrays;
import java.util.List;

class Result10 {
	 public static String gamingArray(List<Integer> arr) {
			int n = arr.size();
			int max = 0;
			int count = 0;

			for (int i = 0; i < n; i++) {
				if (arr.get(i) > max) {
					max = arr.get(i);
					count++;
				}
			}
//	        if (count % 2 == 0) {
//	            return "BOB";
//	        } else {
//	            return "ANDY";
//	        }
			if (count % 2 == 0) {
				return "ANDY";
			} else {
				return "BOB";
			}
	 }
   
}
public class GamingArray {

	public static void main(String[] args) {
		System.out.println(Result10.gamingArray(Arrays.asList(1, 3, 5, 7, 9)));
		System.out.println(Result10.gamingArray(Arrays.asList(7, 4, 6, 5, 9)));
	}
}
