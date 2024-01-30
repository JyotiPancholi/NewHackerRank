package com.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result7 {
	public static int checkBeautifulBinaryString(String s) {
//		 int result = 0;
//		 int i=0;
//		 while( i < s.length() && i<s.length()-3){
//		        String sub = s.substring(i, 3);
//		        if(sub.equals("010")) {
//		            result++;
//		            i+=3;
//		        }else i++;
//		 }
//		 return result;
		
		int diffLenght = s.length() - s.replace("010", "").length();
	    return diffLenght/3;
	}
}

public class BeautifulBinaryString {

	public static void main(String[] args) {
		System.out.println(Result7.checkBeautifulBinaryString("0101010"));
	
		
	}
}
