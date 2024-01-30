package com.day21;

import java.util.List;

class Result5 {
    public static int flippingMatrix(List<List<Integer>> matrix) {
    	 int n = matrix.size() / 2;
         int sum = 0;

         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 int maxVal = Math.max(matrix.get(i).get(j), matrix.get(i).get(2 * n - j - 1));
                 maxVal = Math.max(maxVal, matrix.get(2 * n - i - 1).get(j));
                 maxVal = Math.max(maxVal, matrix.get(2 * n - i - 1).get(2 * n - j - 1));
                 sum += maxVal;
             }
         }

         return sum;
    }
}

public class FlippingTheMatrix {

	public static void main(String[] args) {
//		 List<List<Integer>> matrix = List.of(
//		            List.of(112, 42, 83, 119),
//		            List.of(56, 125, 56, 49),
//		            List.of(15, 78, 101, 43),
//		            List.of(62, 98, 114, 108)
//		        );
//
//		        int result = Result5.flippingMatrix(matrix);
//		        System.out.println(result);
	}
}
