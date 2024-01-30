package com.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result {

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		
    List<List<Integer>> list = new ArrayList<List<Integer>>();
	 for (int i = 0; i <a.size(); i++) {
		 int num = a.get(i);
		 list.add(new ArrayList<Integer>());
		 for (int j = 1; j <=b.get(0); j++) {
			 int result = num*j;
			 list.get(i).add(result);
		 }
	}
	Set<Integer> set=new HashSet<>();
	List<Integer> l=new ArrayList<Integer>();
	for(List<Integer> li:list) {
		for(int i:li) {
			if(!set.add(i)) {
				l.add(i);
			}
		}
	}
	int count=0;
	for (int i = 0; i < l.size(); i++) {
		boolean flag = true;
	int num = l.get(i);
		for (Integer integer : b) {
			if (integer%num!=0) {
				flag = false;
			}
			
		}
		if (flag) {
			count++;
		}
	}
    	return count;
    }
}

public class BetweenTwoSets {

	public static void main(String[] args) {

		System.out.println(Result.getTotalX(Arrays.asList(2, 4), Arrays.asList(16,32,96)));
	}
}
