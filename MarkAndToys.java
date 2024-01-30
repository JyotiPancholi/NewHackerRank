package com.day20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result1 {
    public static int maximumToys(List<Integer> prices, int k) {
    	Collections.sort(prices);
    	int toys =0;
    	int count =0;
    	for (int i = 0; i < prices.size(); i++) {
    		count +=prices.get(i);
			if (count<=k) 
				toys++;
			else 
				break;
		}
    	return toys;
    }
}
public class MarkAndToys {

	public static void main(String[] args) {
		System.out.println(Result1.maximumToys(Arrays.asList(1,12, 5 ,111, 200, 1000, 10), 50));
	}
}
