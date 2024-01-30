package com.day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result2 {

    public static int equalizeArray(List<Integer> arr) {
    	Map< Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.size(); i++) {
			if (!map.containsKey(arr.get(i))) {
				map.put(arr.get(i), 1);
			}else {
				map.put(arr.get(i), map.get(arr.get(i))+1);
			}
		}
		int max =Integer.MIN_VALUE ;
		for (Map.Entry<Integer,Integer> m : map.entrySet() ) {
			if (m.getValue() > max) {
				max =  m.getValue();
			}
		}
    	
    	return arr.size() - max;
    }
}

public class EqualizeTheArray {

	public static void main(String[] args) {
		System.out.println(Result2.equalizeArray(Arrays.asList(3, 3, 2, 1, 3)));
		System.out.println(Result2.equalizeArray(Arrays.asList(1 ,2 ,3 ,1 ,2 ,3 ,3 ,3)));
	}

}
