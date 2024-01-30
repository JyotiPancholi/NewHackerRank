package com.day15;

import java.util.HashSet;
import java.util.Set;

class Result1 {
    public static int stringConstruction(String s) {
    	
    	Set<Character> set = new HashSet<Character>();
    	for (char c : s.toCharArray()) {
			set.add(c);
		}
    	return set.size();
//		int count =0;
//		String p ="";
//		for (int i = 0; i < s.length(); i++) {
//			p.concat(s.charAt(i))
//		}
//    	return 0;
    }
}

public class StringConstruction {

	public static void main(String[] args) {
		System.out.println(Result1.stringConstruction("abab"));
	}
}
