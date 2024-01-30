package com.day14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result3 {
	
    public static int gemstones(List<String> arr) {
    	HashSet<Character> gemSet = new HashSet<>();
        for (char mineral : arr.get(0).toCharArray()) {
            gemSet.add(mineral);
        }
        for (int i = 1; i < arr.size(); i++) {
            Set<Character> currentRockMinerals = new HashSet<>();
            for (char mineral : arr.get(i).toCharArray()) {
                currentRockMinerals.add(mineral);
            }
            gemSet.retainAll(currentRockMinerals);
        }
        return gemSet.size();
    }
}
public class Gemstones {

	public static void main(String[] args) {
		System.out.println(Result3.gemstones(Arrays.asList("abcdde", "baccd", "eeabg")));
	}
}
