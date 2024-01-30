package com.day17;

import java.util.Arrays;
import java.util.List;

class Result1 {

    public static int workbook(int n, int k, List<Integer> arr) {
    	int page =1;
    	int count =0;
    	for (int i = 0; i < n; i++) {
			for (int j = 1; j <=arr.get(i); j++) {
				if (j==page) {
						count++;
				}
				if ((j!=arr.get(i)) && (j%k==0) ) {
					page++;
				}
			}
			page++;
		}
    	return count;
    }
}
public class LisaWorkbook {

	public static void main(String[] args) {
		System.out.println(Result1.workbook(5, 3, Arrays.asList(4,2,6,1,10)));
	}
}
