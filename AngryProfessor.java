package com.day10;

import java.util.Arrays;
import java.util.List;

class Result6 {

    public static String angryProfessor(int k, List<Integer> a) {
    	int count =0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i)<=0) {
				count ++;
			}
		}
		if (count>=k) {
			return "NO";
		}
    	return "YES";
    }
}

public class AngryProfessor {

	public static void main(String[] args) {
		System.out.println(Result6.angryProfessor(3, Arrays.asList(-1 ,-3 ,4 ,2)));
		System.out.println(Result6.angryProfessor(2, Arrays.asList(0 ,-1 ,2 ,1)));
	}
}
