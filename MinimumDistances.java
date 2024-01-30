package com.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result3 {
    public static int minimumDistances(List<Integer> a) {
    	Map< Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < a.size() ; i++) {
			if (!map.containsKey(a.get(i))) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(a.get(i), list);
			}else {
				List<Integer> list=map.get(a.get(i));
				list.add(i);
				map.put(a.get(i), list);
			}
		}
		int min = Integer.MAX_VALUE;
		boolean f=false;
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			List<Integer> list = entry.getValue();
			if (list.size()>1) {
				f=true;
				int t = Math.abs(list.get(0)-list.get(1));
				min = min > t ? t:min; 
			}
		}
    	return f ? min : -1;

    }
}

public class MinimumDistances {

	public static void main(String[] args) {
		System.out.println(Result3.minimumDistances(Arrays.asList(7, 1, 3, 4, 1, 7)));
	}
}
