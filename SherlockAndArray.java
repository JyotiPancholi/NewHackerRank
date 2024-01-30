package com.day20;

import java.util.Arrays;
import java.util.List;

class Result4 {

	public static String balancedSums(List<Integer> arr) {
		int totalSum = 0;
		int runningSum = 0;
		for (int i = 0; i < arr.size(); i++) {
			totalSum += arr.get(i);
		}
		for (int  i = 0; i < arr.size(); i++) {
			totalSum -= arr.get(i);

			if (runningSum == totalSum)
				return "YES";
			runningSum += arr.get(i);
		}
		return "NO";
	}
}

public class SherlockAndArray {

	public static void main(String[] args) {
		System.out.println(Result4.balancedSums(Arrays.asList(5,6,8,11)));
		System.out.println(Result4.balancedSums(Arrays.asList(1, 2, 3)));
		System.out.println(Result4.balancedSums(Arrays.asList(1, 2,3 ,3)));
	}
}
