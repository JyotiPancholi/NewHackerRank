package com.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result6 {
	public static String checkPanagram(String s) {
		s=s.toLowerCase();
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				set.add(s.charAt(i));
			}
		}
		return set.size()==26?"pangram":"not pangram";
	}
}

public class Panagram {

	public static void main(String[] args) {
		System.out.println(Result6.checkPanagram("We promptly judged antique ivory buckles for the next prize"));
		System.out.println(Result6.checkPanagram("We promptly judged antique ivory buckles for the prize"));
		
	}
}
