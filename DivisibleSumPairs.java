package com.day5;

import java.util.Arrays;
import java.util.List;

class Result1 {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int count =0;
		for (int i = 0; i <ar.size()-1; i++) {
			for (int j = i+1; j < ar.size(); j++) {
				if (i < j &&( ar.get(i) + ar.get(j))%k==0) {
					count++;
				}
			}
		}
		return count;
		
//		for (int i = 0; i <ar.size()-1; i++) {
//			for (int j = i+1; j <ar.size(); j++) {
//				if (i < j ) {
//					if ((ar.get(i) + ar.get(j))%k==0) {
//						count++;
//					}
//				}
//			}
//		}
//		return count;
	}
}

public class DivisibleSumPairs {

	public static void main(String[] args) {
//		Result1.divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2));
		System.out.println(Result1.divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
	}

}
