package com.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result2 {
    public static List<Integer> countingSort(List<Integer> arr) {
    	int max = 100; 
        int[] countingArray = new int[max + 1];

        for (int num : arr) {
            countingArray[num]++;
        }

        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i <= max; i++) {
            while (countingArray[i] > 0) {
            	list.add(i);
                countingArray[i]--;
            }
        }
        
        return list;
//    	int max = Collections.max(arr);
//        int[] count = new int[max + 1];
//        for (int num : arr) {
//        	count[num]++;
//        }
//
//        List<Integer> sortedList = new ArrayList<>();
//
//        for (int i = 0; i <= max; i++) {
//            for (int j = 0; j < count[i]; j++) {
//                sortedList.add(j);
//            }
//        }
//        return sortedList;

    	
    	
//    	int[] array=new int[100];
//		 for(int i = 0; i < arr.size(); i++)
//	        {
//	            int num = arr.get(i);
//	            array[num] = array[num] + 1;
//	        }
//		 List<Integer> l=Arrays.stream(array).boxed().collect(Collectors.toList());
//			return l; 
    }
}
public class CountingSort2 {

	public static void main(String[] args) {
		System.out.println(Result2.countingSort(Arrays.asList(63, 25 ,73 ,1 ,98 ,73 ,56 ,84 ,86, 57, 16, 83, 8 ,
				25, 81, 56, 9, 53 ,98 ,67 ,99 ,12 ,83 ,89, 80, 91, 39 ,86, 76, 85, 74, 39 ,25, 90 ,59, 10, 94, 32,
				44 ,3 ,89, 30,27 ,79 ,46 ,96 ,27 ,32 ,18 ,21 ,92 ,69 ,81, 40, 40, 34, 68, 78, 24, 87, 42 ,69 ,23 ,
				41 ,78 ,22 ,6 ,90, 99, 89,50, 30, 20, 1 ,43, 3, 70, 95, 33, 46 ,44 ,9 ,69, 48, 33, 60 ,65 ,16 ,82 ,67 ,61 ,32 ,21 ,79 ,
				75 ,75 ,13 ,87, 70, 33 )));
	}
}
