package com.day14;

class Result8 {
    public static String funnyString(String s) {
    	String reverse = (new StringBuilder(s)).reverse().toString();
    	for (int i = 1; i < s.length(); i++) {
    		 if (Math.abs(((int)s.charAt(i)) - ((int)s.charAt(i-1))) != Math.abs(((int)reverse.charAt(i)) -
    				 ((int)reverse.charAt(i-1)))) {
                 return "Not Funny";
             }
		}
    	 return "Funny";
    }

}

public class FunnyString {

	public static void main(String[] args) {
		System.out.println(Result8.funnyString("hjbjbvehj"));
	}
}
