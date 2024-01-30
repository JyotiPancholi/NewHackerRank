package com.day17;

import java.util.Arrays;
import java.util.List;

class Result4 {
    public static String fairRations(List<Integer> B) {
    	int count = 0;
        for (int i = 0; i < B.size() - 1; i++) {
            if (B.get(i) % 2 != 0) {
                B.set(i, B.get(i) + 1);
                B.set(i + 1, B.get(i + 1) + 1);
                count += 2;
            }
        }
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i) % 2 != 0) {
                return "NO";
            }
        }
        return String.valueOf(count);
    }
}
public class FairRations {

	public static void main(String[] args) {
		System.out.println(Result4.fairRations(Arrays.asList(2, 3, 4, 5, 6)));
		System.out.println(Result4.fairRations(Arrays.asList(4, 5, 6,7)));
		System.out.println(Result4.fairRations(Arrays.asList(1,2)));
	}
}
