package com.day3;

import java.util.Arrays;
import java.util.List;

class Result4 {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    	int sum =0;
    	for (int i = 0; i < bill.size(); i++) {
			if(i!=k) {
    		sum = sum+bill.get(i);
			}
		}
    	int half = sum/2;
    	int result = b-half;
    	System.out.println(result==0?"Bon Appetit":result);
    }
}

public class BillDivision {
	public static void main(String[] args) {
		Result4.bonAppetit(Arrays.asList(3,10,2,9), 1, 12);
	}
}
