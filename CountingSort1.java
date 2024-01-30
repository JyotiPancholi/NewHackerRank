package com.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Result2 {
	public static List<Integer> countingSort(List<Integer> arr) {
//		Collections.sort(arr);
//		int max = arr.get(arr.size()-1);
//		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//		for (int i = 0; i < arr.size(); i++) {
//			if (!map.containsKey(arr.get(i))) {
//				map.put(arr.get(i), 1);
//			}else {
//				map.put(arr.get(i), map.get(arr.get(i))+1);
//			}
//		}
//		int array[] = new int[max];
//		for(Map.Entry<Integer, Integer> ent : map.entrySet()) {
//			array[ent.getKey()]=ent.getValue();
//		}
////		List<Integer> l=Arrays.stream(array).boxed().toList();
//		List<Integer> l=Arrays.stream(array).boxed().collect(Collectors.toList());
//		return l;
		
		
		
		int[] array=new int[100];
		 for(int i = 0; i < arr.size(); i++)
	        {
	            int num = arr.get(i);
	            array[num] = array[num] + 1;
	        }
		 List<Integer> l=Arrays.stream(array).boxed().collect(Collectors.toList());
			return l; 
		
		
	}
}

public class CountingSort1 {

	public static void main(String[] args) {

	}
}
