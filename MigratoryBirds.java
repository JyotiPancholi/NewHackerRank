package com.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Result1 {

    public static int migratoryBirds(List<Integer> arr) {
    	int max =0;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < arr.size(); i++) {
			if (!map.containsKey(arr.get(i))) {
				map.put(arr.get(i), 1);
			}else {
				int temp = map.get(arr.get(i))+1;
				map.put(arr.get(i), temp);
				if (max<temp) {
					max =temp;
				}
			}
		}
    	final int m=max;
    	map=map.entrySet().stream().filter(mapper->mapper.getValue()==m)
    			.collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    	
		return Collections.min(map.keySet());
    }

}

public class MigratoryBirds {

	public static void main(String[] args) {
		System.out.println(Result1.migratoryBirds(Arrays.asList(1 ,4 ,4 ,4 ,5, 3)));
	}

}
