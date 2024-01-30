package com.day6;

class Result1 {

    public static int countingValleys(int steps, String path) {
    	int seaLevel =0 ; 
    	int valleys =0;
		for (int i = 0; i < steps; i++) {
		char c =  path.charAt(i);
		 if (c=='D') {
			seaLevel--;
		  }else if (c=='U') {
			seaLevel++;
		}
		 
		 if (seaLevel==0 && c=='U') {
			valleys++;
		}
		}
    	return valleys;
    }

}

public class CountingValleys {

	public static void main(String[] args) {
		int result = Result1.countingValleys(8,"DDUUUUDD");
		System.out.println(result);
	}
}
