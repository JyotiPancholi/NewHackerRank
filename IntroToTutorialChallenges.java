package com.day19;

import java.util.Arrays;
import java.util.List;

class Result1 {
    public static int introTutorial(int V, List<Integer> arr) {
    	int index =0 ;
    	for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i)==V) {
				index = i;
				return index;
			}
		}
		return -1;
    }
}

public class IntroToTutorialChallenges {

	public static void main(String[] args) {
		System.out.println(Result1.introTutorial(4, Arrays.asList(1, 4,4, 5, 7, 4, 12)));
	}
}
