package com.day7;

import java.util.Arrays;
import java.util.List;

class Result3 {

    public static int hurdleRace(int k, List<Integer> height) {
		int max = height.stream().mapToInt(mapper -> mapper).max().getAsInt();
    	if (max<=k) {
			return 0;
		}
    	else {
			return max-k;
		}

    }
}

public class TheHurdleRace {

	public static void main(String[] args) {
		System.out.println(Result3.hurdleRace(7, Arrays.asList(2, 5, 8 ,5 ,2)));
	}
}
