package com.day21;

import java.util.Arrays;
import java.util.List;

class Result2 {
    public static int sansaXor(List<Integer> arr) {
    	int n = arr.size();
        if (n % 2 == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < n; i += 2) {
            result ^= arr.get(i);
        }

        return result;
    }
}
public class SansaAndXOR {

	public static void main(String[] args) {
		System.out.println(Result2.sansaXor(Arrays.asList(1, 2 ,3)));
	}
}
