package com.day4;

import java.util.Collections;
import java.util.List;

class Result3 {

    public static int birthdayCakeCandles(List<Integer> candles) {
		
    	final int s=Collections.max(candles);
    	return (int)candles.stream().filter(n->n==s).count();
    }
}

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
