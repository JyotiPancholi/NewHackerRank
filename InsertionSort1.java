package com.day18;

import java.util.Arrays;
import java.util.List;

class Result5 {
	public static void insertionSort1(int n, List<Integer> arr) {
		
    	for(int i=0;i<n;i++) {
    		int p=arr.get(i);
    		int j;
    		for( j=i-1;j>=0 && arr.get(j)>p;j--) {
    			arr.set(j+1, arr.get(j));
    			print(arr);
    		}
    		arr.set(j+1, p);
    	}
    	print(arr);
    }
    static void print(List<Integer> l) {
    	for(int i=0;i<l.size();i++) {
    		System.out.print(l.get(i)+" ");
    	}
    	System.out.println();
    }
}
public class InsertionSort1 {

	public static void main(String[] args) {
		Result5.insertionSort1(5,Arrays.asList(2, 4, 6, 8, 3));
	}
}
