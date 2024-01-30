package com.day1;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {


    public static int simpleArraySum(List<Integer> arr) {
		return arr.stream().mapToInt(m->m).sum();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(1);
        ar.add(1);
        ar.add(2);
        ar.add(2);
        ar.add(2);
        ar.add(12);
        ar.add(13);
	}

}
