package com.day9;

class Result1 {

    public static int camelcase(String s) {
		String p = s.toUpperCase();
		 int words  =1 ;
		 for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==p.charAt(i)) {
				words++;
			}
		}
		 if (s.isEmpty()) {
			return 0 ;
		}
		else    	
    	return words;
    }

}

public class CamelCase {
	public static void main(String[] args) {
		System.out.println(Result1.camelcase("saveChangesInTheEditor"));
		System.out.println(Result1.camelcase("oneTwoThree"));
	}
}
