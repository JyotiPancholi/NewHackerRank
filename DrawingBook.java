package com.day4;

class Result5 {
    public static int pageCount(int n, int p) {
    	int frontCount = n / 2;
		int targetFromFront = p / 2;
		int targetCountFromBack = frontCount - targetFromFront;

		return Math.min(targetFromFront, targetCountFromBack);
    }
}

public class DrawingBook {

	public static void main(String[] args) {
		System.out.println(Result5.pageCount(6, 2));
	}
}
