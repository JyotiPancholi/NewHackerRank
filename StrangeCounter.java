package com.day18;

import java.util.Arrays;
import java.util.List;

class Result6 {
	public static long strangeCounter(long t) {
		long count=3;
		
		while(t>count) {
			t-=count;
			count*=2;
		}
    	return count-t+1;
    }
    
}
public class StrangeCounter {

	public static void main(String[] args) {
		System.out.println(Result6.strangeCounter(4));
		
	}
}
