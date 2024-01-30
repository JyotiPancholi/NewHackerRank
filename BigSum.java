package com.day3;

import java.util.Arrays;
import java.util.List;

class Result5 {

    

    public static long aVeryBigSum(List<Long> ar) {
    	
    	return ar.stream().reduce((a,b)->a+b).get();

    }

}
public class BigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(Result5.aVeryBigSum(Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)));

	}

}
