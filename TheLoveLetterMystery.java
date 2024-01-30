package com.day12;


class Result2 {
    public static int theLoveLetterMystery(String s) {
    	int n = s.length();
        int operations = 0;

        for (int i = 0; i < n / 2; i++) {
            char left = s.charAt(i);
            char right = s.charAt(n - i - 1);
            operations += Math.abs(left - right);
        }

        return operations;
        
//    	int count  =0 ;
//    	for (int i = 0; i <s.length()/2; i++) {
//			count +=Math.abs(s.charAt(i)-s.charAt(s.length()-1-i));
//		}
//    	return count;
    }

}

public class TheLoveLetterMystery {

	public static void main(String[] args) {
		System.out.println(Result2.theLoveLetterMystery("abc"));
		System.out.println(Result2.theLoveLetterMystery("abcba"));
		System.out.println(Result2.theLoveLetterMystery("abcd"));
		System.out.println(Result2.theLoveLetterMystery("cba"));
	}
}
