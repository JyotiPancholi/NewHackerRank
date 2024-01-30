package com.day12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result9 {
	public static int pickNumbers(List<Integer> list) {

		int max = Integer.MIN_VALUE;
		int arr[] = new int[100];
		for (int i = 0; i < list.size(); i++) {
			arr[list.get(i)]++;
		}
		for (int i = 0; i < 99; i++) {
			max = Math.max(max, arr[i] + arr[i + 1]);
		}
		return max;
	}
}

public class PickingNumbers {

	public static void main(String[] args) {
		System.out.println(Result9.pickNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
	}
}
