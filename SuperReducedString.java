package com.day3;

import java.util.HashMap;
import java.util.Map;

class Result3 {

    public static String superReducedString(String s) {
    	s = s.toLowerCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		String news="";
		for(Map.Entry<Character, Integer> e:map.entrySet()) {
			if(e.getValue()%2!=0) {
				news=news+e.getKey();
			}
		}
    	return news==""?"Empty String":news;
    }
}


public class SuperReducedString {

	public static void main(String[] args) {
		String s= Result3.superReducedString("aabb");
		System.out.println(s);
	}
}