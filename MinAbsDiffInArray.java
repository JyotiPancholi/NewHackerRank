package com.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result4 {

	public static int minimumAbsoluteDifference(List<Integer> arr) {
		
		//type -1 -termineted due to time issue
//    	List< Integer> list = new ArrayList<Integer>();
//    	int sum =0;
//    	for (int i = 0; i < arr.size(); i++) {
//			for (int j = i+1; j < arr.size(); j++) {
//				sum = Math.abs(arr.get(i)-arr.get(j));
//				list.add(sum);
//			}sum=0;
//			
//		}
//    	return list.stream().mapToInt(mapper -> mapper).min().getAsInt();

    	
    	// type -2 termineted due to time issue
//		int result = Integer.MAX_VALUE;
//		int n = arr.size();
//		for (int i = 0; i < n; i++) {
//			int sum = 0;
//			for (int j = i+1; j < n; j++) {
//				sum = Math.abs(arr.get(i) - arr.get(j));
//				result = Math.min(sum, result);
//			}
//		}
//		return result;
		
		
		//type 3 - successfully passed
		Collections.sort(arr);
		int result = Integer.MAX_VALUE;
		for(int i = 1; i < arr.size(); i++){
	        int d = arr.get(i) - arr.get(i-1);
	        if( d < result) result = d;
	    }
		return result;
	}

}

public class MinAbsDiffInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Result4.minimumAbsoluteDifference(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54 ,75)));

		System.out.println(Result4.minimumAbsoluteDifference(Arrays.asList(1, -3, 71, 68, 17)));
		System.out.println(Result4.minimumAbsoluteDifference(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54 ,75)));

	}

}
