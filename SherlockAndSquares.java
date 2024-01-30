package com.day10;

class Result7 {

    public static int squares(int a, int b) {
    	
    	 int a1 = (int)Math.ceil(Math.sqrt(a));
         int b1 = (int)Math.floor(Math.sqrt(b));
    	return b1-a1+1;
    }
}

public class SherlockAndSquares {

	public static void main(String[] args) {
		System.out.println(Result7.squares(17, 24));
	}
}
