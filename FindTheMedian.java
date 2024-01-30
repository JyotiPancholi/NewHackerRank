package com.day20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result3 {

    public static int findMedian(List<Integer> arr) {
    	Collections.sort(arr);
    	int index = (int) ((arr.size()/2) + 0.5);
    	return arr.get(index);
    }

}
public class FindTheMedian {

	public static void main(String[] args) {
		System.out.println(Result3.findMedian(Arrays.asList(0 ,1 ,2 ,4, 6 ,5 ,3)));
		System.out.println(Result3.findMedian(Arrays.asList(5 ,3,1,2,4)));
	}
}
