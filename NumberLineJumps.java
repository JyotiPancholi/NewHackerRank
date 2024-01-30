package com.day2;

class Result {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    	for (int i = 0; i <10000; i++) {
			x1 = x1+v1;
			x2 = x2+v2;
			if (x1==x2) {
				return "YES";
//				System.out.println("YES");
//				System.exit(0);
			}
		}
		return "NO"; 
	}
}

public class NumberLineJumps {

	public static void main(String[] args) {
	String s =	Result.kangaroo(0, 2, 5, 3);
	System.out.println(s);
	}
}
