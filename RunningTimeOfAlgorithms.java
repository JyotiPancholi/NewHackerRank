package com.day18;

import java.util.Arrays;
import java.util.List;

class Result9 {

    public static int runningTime(List<Integer> arr) {
//    	int comparisons = 0;
        int shifts = 0;

        for (int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;
//            comparisons++;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
//                comparisons++;
                shifts++;
            }
            arr.set(j + 1, key);
        }

        return shifts;

    }

}

public class RunningTimeOfAlgorithms {

	public static void main(String[] args) {
		System.out.println(Result9.runningTime(Arrays.asList(2, 1, 3, 1, 2)));
	}

}
