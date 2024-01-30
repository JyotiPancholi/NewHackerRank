package com.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result5 {
	public static int alternatingCharacters(String s) {
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
		}
		return count;
	}
}

public class AlternatingCharacters {

	public static void main(String[] args) {
		System.out.println(Result5.alternatingCharacters("ABBABAAB"));
	}
}
