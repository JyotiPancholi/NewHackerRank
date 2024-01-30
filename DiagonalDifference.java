package com.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result2 {

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int sum1 =0;
    	int sum2 =0;
        for(int i=0;i<arr.size();i++)
        	for (int j = 0; j < arr.get(i).size(); j++) {
				if (i==j) {
					sum1 = sum1+arr.get(i).get(j);
				}
				if (i+j==arr.get(i).size()-1) {
					sum2 = sum2+arr.get(i).get(j);
				}
			}
		return Math.abs(sum1-sum2);
		
		
		
//		 int leftDiagonal = 0;
//	        int rightDiagonal = 0;
//		    
//	        for (int i = 0; i < arr.size(); i++) {
//		    leftDiagonal += arr.get(i).get(i);
//		    rightDiagonal += arr.get(i).get((arr.get(i).size() - 1) - i);
//		}
//	        
//	        return Math.abs(leftDiagonal - rightDiagonal);
    }

}
public class DiagonalDifference {

	public static void main(String[] args) {

		List<List<Integer>> list = Arrays.asList(Arrays.asList(11, 2, 4),
									Arrays.asList(4, 5, 6),
									Arrays.asList(10,8, -12 ));
		System.out.println(Result2.diagonalDifference(list));
	}

}
