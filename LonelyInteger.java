package com.day13;

import java.util.Arrays;
import java.util.List;

class Result6 {
	public static int lonelyinteger(List<Integer> a) {

		int result = 0;
		for (int num : a) {
			result ^= num;
		}
		return result;

//		Set< Integer> set = new HashSet<Integer>();
//		for (int i = 0; i < a.size(); i++) {
//			if (a.get(i)!=0) {
//				set.add(a.get(i));
//			}
//		}
//		return set.size();

//		Map< Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < a.size(); i++) {
//			if (!map.containsKey(a.get(i))) {
//				map.put(a.get(i), 1);
//			} else {
//				map.put(a.get(i), map.get(a.get(i))+1);
//			}
//		}
//		int count;
//		for (Integer entry : map.keySet() ) {
//			if (map.get(entry) ==1 ) {
//				count ++;
//			}
//		}
//		return count;
	}
}

public class LonelyInteger {

	public static void main(String[] args) {
		System.out.println(Result6.lonelyinteger(Arrays.asList(0, 0, 2, 1, 1)));
	}
}
