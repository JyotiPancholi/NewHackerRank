package com.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result2 {

    public static void miniMaxSum(List<Integer> arr) {
    	Collections.sort(arr);
    	int min = Collections.min(arr);
    	int max = Collections.max(arr);
    	long sum = arr.stream().mapToLong(mapper -> mapper).sum();
    	System.out.println((sum-max)+" "+(sum-min));
    	
    	
//    	long sum = 0L;
//    	long min  = Long.MAX_VALUE;
//    	long max = Long.MIN_VALUE;
//    	for (int i = 0; i < arr.size(); i++) {
//			for (int j = 0; j < arr.size(); j++) {
//				if (i!=j) {
//					sum = sum+arr.get(j);
//				}
//			}
//			if (sum>max) {
//				max=sum;
//			}else if (sum<min) {
//				min = sum; 
//			}
//			sum = 0;
//    	}
//    	System.out.println(min+" "+max);
    	
    	
//    	List<Integer> list =  new ArrayList<Integer>();
//    	int sum =0;
//    	for (int i = 0; i < arr.size(); i++) {
//			for (int j = 0; j < arr.size(); j++) {
//				if (i!=j) {
//					sum = sum+arr.get(j);
//				}
//			}
//			list.add(sum);
//			sum=0;
//		}
//    	int min = Collections.min(list);
//    	int max = Collections.max(list);
//    	System.out.println(min+" "+max);
    	
    }

}

public class MiniMaxSum {

	public static void main(String[] args) {
		Result2.miniMaxSum(Arrays.asList(1,2,3,4,5));
	}
}
