package com.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result6 {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
    	Collections.sort(arr);
    	List< Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < arr.size(); i++) {
    		int count =0;
			int t = arr.get(i);
			for (int j = i; j < arr.size(); j++) {
				if (arr.get(j)>=t && t!=0) {
					count++;
					int k = arr.get(j)-t;
					arr.remove(j);
					arr.add(j, k);
				}
			}
			if (count!=0) {
				list.add(count);
			}
		}
    	return list;
    }
}

public class CutTheSticks {

	public static void main(String[] args) {
		System.out.println(Result6.cutTheSticks(Arrays.asList(5, 4, 4, 2, 2, 8)));
	}
}
