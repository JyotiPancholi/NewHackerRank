package com.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Result8 {
	 public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
	
		 	List<Integer> l = new ArrayList<>();
	        Set<Integer> set = new HashSet<>();
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int integer : arr) {
	            map.put(integer, map.getOrDefault(integer, 0)+1);
	        }
	        for(int integer : brr) {
	            if(!map.containsKey(integer)) {
	                set.add(integer);
	            }
	            else {
	                if(map.get(integer) == 1) {
	                    map.remove(integer);
	                } else {
	                    map.put(integer, map.get(integer)-1);
	                }
	            }
	        }
	        for(int integer : set) 
	            l.add(integer);
	        Collections.sort(l);
	        return l;
		 
		 
		 
		 
		 
		 
		 
//		 Map<Integer, Integer> map1=new HashMap<Integer, Integer>();
//		 Map<Integer, Integer> map2=new HashMap<Integer, Integer>();
//		 for (Integer integer : arr) {
//			 if(map1.containsKey(integer)) {
//				 map1.put(integer, map1.get(integer)+1);
//			 }else {
//				 map1.put(integer, 1);
//			 }
//		}
//		 for (Integer integer : brr) {
//			 if(map2.containsKey(integer)) {
//				 map2.put(integer, map2.get(integer)+1);
//			 }else {
//				 map2.put(integer, 1);
//			 }
//		}
//		 Set<Integer> s=new HashSet<Integer>();
//		 for (Integer integer : brr) {
//			if(!map1.containsKey(integer)) {
//				s.add(integer);
//			}
//			else if(map1.get(integer)!= map2.get(integer)) {
//				s.add(integer);
//			}
//		}
//		 List<Integer> l= new ArrayList<>(s);
//		 Collections.sort(l);
//		 return l;
	 }

}

public class MissingNumbers {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(7,2,5,3,5,3);
		List<Integer> l2 = Arrays.asList(7,2,5,4,6,3,5,3);
		Result8.missingNumbers(l1, l2).stream().forEach(System.out::println);
	}
}
