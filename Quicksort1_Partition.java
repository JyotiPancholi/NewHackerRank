package com.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result2 {

    public static List<Integer> quickSort(List<Integer> arr) {
    	int p = arr.get(0);
    	List<Integer> left = new ArrayList<Integer>();
    	List<Integer> right = new ArrayList<Integer>();
    	for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i)>p) {
				right.add(arr.get(i));
			}else if (arr.get(i)<p) {
				left.add(arr.get(i));
			}
		}
    	List<Integer> list = new ArrayList<Integer>();
    	list.addAll(left);
    	list.add(p);
    	list.addAll(right);
    	return list;
    }
}
public class Quicksort1_Partition {

	public static void main(String[] args) {
		List<Integer> result = Result2.quickSort(Arrays.asList(6 ,4 ,8 ,7 ,2));
		System.out.println(result);
	}
}
