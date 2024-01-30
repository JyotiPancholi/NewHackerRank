package com.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// code is running successfully on hacker rank
class Result8 {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    	int i = a.size()-1;
    	int count =0;
    	while (count++ < k) {
    		int t =a.remove(i);
    		a.add(0, t);
		}
    	List<Integer> list =new ArrayList<Integer>();
    	for (int j = 0; j < queries.size(); j++) {
    		list.add(a.get(queries.get(j)));
		}
		return list;
    	
    }

}

public class CircularArrayRotation {

	public static void main(String[] args) {
		Result8.circularArrayRotation(Arrays.asList(1,2,3), 2, Arrays.asList(0,1,2));
	}

}
