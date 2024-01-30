package com.day13;

class Result2 {
	public static long repeatedString(String s, long n) {
		if (!s.contains("a"))
			return 0;

		if (s.length() == 1)
			return n;
		long count =0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='a') {
				count++;
			}
		}
		long stringRepeated = n/s.length();
		count = count* stringRepeated;
		long remainingString = n % s.length();
		for (int i = 0; i < remainingString; i++) {
			if (s.charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}
}

public class RepeatedString {

	public static void main(String[] args) {
		System.out.println(Result2.repeatedString("aba", 10));
	}
}
