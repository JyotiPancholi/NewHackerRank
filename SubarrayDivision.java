package com.day4;

import java.util.Arrays;
import java.util.List;

class Result {

    public static int birthday(List<Integer> s, int d, int m) {
    	int count =0;
	for (int i = 0; i <= s.size()-m; i++) {
		int sum =0;
		for (int j = i; j <i+m; j++) {
			sum = sum+s.get(j);
		}
		if (sum==d) {
			count ++;
		}
	}
    	return count;
    }

}

public class SubarrayDivision {

	public static void main(String[] args) {

		System.out.println(Result.birthday(Arrays.asList(1, 1, 1 ,1 ,1, 1 ), 3, 2));
	}

}
