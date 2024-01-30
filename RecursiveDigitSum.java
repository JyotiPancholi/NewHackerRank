package com.day21;

class Result3 {

	public static int superDigit(String n, int k) {

		if (n.length() == 1) {
            return Character.getNumericValue(n.charAt(0));
        }
        long sumOfDigits = 0;
        for (int i = 0; i < n.length(); i++) {
            sumOfDigits += Character.getNumericValue(n.charAt(i));
        }
        String multipliedSum = String.valueOf(sumOfDigits * k);
        return superDigit(multipliedSum, 1);
	}
}

public class RecursiveDigitSum {

	public static void main(String[] args) {
		System.out.println(Result3.superDigit("9875987598759875",4));
//		System.out.println(Result3.superDigit("8"));
	}
}
