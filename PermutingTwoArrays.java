package com.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result7 {
	 public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
		 Collections.sort(A);
		 Collections.sort(B, Collections.reverseOrder());
		 for (int i = 0; i < A.size(); i++) {
			 if(A.get(i)+B.get(i)<k) {
				 return "NO";
			 }
		 }
		 

		 return "YES";
	 }

}

public class PermutingTwoArrays {

	public static void main(String[] args) {

		List l1 = Arrays.asList(1,2, 2, 1);
		List l2 = Arrays.asList(3,3,3,4);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(l1);
		list.add(l2);
		System.out.println(Result7.twoArrays(10, l1, l2));
		;
	}
}
