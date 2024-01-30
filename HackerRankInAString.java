package com.day13;

class Result3 {
	public static String hackerrankInString(String s) {
		String target = "hackerrank";
        int targetIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
            }
            
            if (targetIndex == target.length()) {
                return "YES";
            }
        }

        return "NO";
	}
}

public class HackerRankInAString {

	public static void main(String[] args) {
		System.out.println(Result3.hackerrankInString("hereiamstackerrank"));
	}
}
