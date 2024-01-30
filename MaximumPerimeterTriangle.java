package com.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result4 {
	public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
		Collections.sort(sticks, Collections.reverseOrder());
		for (int i = 0; i < sticks.size() - 2; i++) {
			int a = sticks.get(i);
			int b = sticks.get(i + 1);
			int c = sticks.get(i + 2);
			if (a < b + c) {

				return Stream.of(c, b, a).collect(Collectors.toList());
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		return list;
	}
}

public class MaximumPerimeterTriangle {

	public static void main(String[] args) {
		System.out.println(Result4.maximumPerimeterTriangle(Arrays.asList(1, 1, 1, 3, 3)));
	}
}
