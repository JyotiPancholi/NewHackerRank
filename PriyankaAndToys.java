package com.day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result3 {
    public static int toys(List<Integer> w) {
    	Collections.sort(w);
		int count =1;
		int limit = w.get(0);
		for (int i = 0; i < w.size(); i++) {
			if (w.get(i)>limit+4) {
				limit = w.get(i);
				count++;
			}
		}
    	return count;
    }
}

public class PriyankaAndToys {

	public static void main(String[] args) {
		System.out.println(Result3.toys(Arrays.asList(1, 2, 3 ,21, 7 ,12 ,14 ,21)));
	}
}
