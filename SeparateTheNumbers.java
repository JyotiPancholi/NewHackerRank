package com.day12;

class Result1 {
	public static void separateNumbers(String s) {
		 int length = s.length();
	        boolean beautiful = false;
	        long firstNumber = -1;

	        for (int i = 1; i <= length / 2; i++) {
	            long current = Long.parseLong(s.substring(0, i));

	            if (isBeautifulSequence(s, current)) {
	                beautiful = true;
	                firstNumber = current;
	                break;
	            }
	        }

	        if (beautiful) {
	            System.out.println("YES " + firstNumber);
	        } else {
	            System.out.println("NO");
	        }
	    }

	    private static boolean isBeautifulSequence(String s, long current) {
	        String sequence = Long.toString(current);

	        while (sequence.length() < s.length()) {
	            current++;
	            sequence += Long.toString(current);
	        }

	        return s.equals(sequence);
	}
}

//int length = s.length();
//boolean beautiful = false;
//long firstNumber = -1;
//
//for (int i = 1; i <= length / 2; i++) {
//    long current = Long.parseLong(s.substring(0, i));
//
//    String sequence = Long.toString(current);
//
//    while (sequence.length() < s.length()) {
//        current++;
//        sequence += Long.toString(current);
//    }
//
//    if (s.equals(sequence)) {
//        beautiful = true;
//        firstNumber = current;
//        break;
//    }
//}
//
//if (beautiful) {
//    System.out.println("YES " + firstNumber);
//} else {
//    System.out.println("NO");
//}

public class SeparateTheNumbers {

	public static void main(String[] args) {
		Result1.separateNumbers("010203");
		Result1.separateNumbers("101103");
		Result1.separateNumbers("1234");
		Result1.separateNumbers("91011");
		Result1.separateNumbers("99100");
		Result1.separateNumbers("99910001001");
		Result1.separateNumbers("7891011");
		Result1.separateNumbers("9899100");
		Result1.separateNumbers("999100010001");
	}
}
