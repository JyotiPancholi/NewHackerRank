package com.day8;

import java.util.ArrayList;
import java.util.List;

class Result2 {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		List<Integer> list = new ArrayList<Integer>();
		int max =0 ;
		int sum =0;
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				sum = keyboards[i]+drives[j];
				if(sum<=b) {
				list.add(sum);
				}
			}
		}
		if (!list.isEmpty()) 
		{ 
            max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
//            return max;
//        } else {
//            return -1;
        }

		
		
		return  max==0?-1:max;
		
		
		
		//    	int n=keyboards.length;
//    	int m=drives.length;
//    	int max=Integer.MIN_VALUE;
//    	for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                int sum = keyboards[i] + drives[j];
//                if (sum > b)  continue;
//                max = Math.max(max, sum);
//            }  
//        }
//    	return max;
    }
}
public class ElectronicsShop {

	public static void main(String[] args) {
		 int arr1[] = {3,1};
		 int arr2[] = {5,2,8};
		System.out.println(Result2.getMoneySpent(arr1, arr2, 10));
		
//		 int arr1[] = {40,50,60};
//		 int arr2[] = {5,8,12};
//		System.out.println(Result2.getMoneySpent(arr1, arr2, 60));
//		
//		 int arr1[] = {5};
//		 int arr2[] = {4};
//		System.out.println(Result2.getMoneySpent(arr1, arr2, 5));
//		
		
	}

}
