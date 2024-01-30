package com.day10;


class Result3 {

    public static int beautifulDays(int i, int j, int k) {
    	
    	int count=0;
		for (int l = i; l <=j; l++) {
			int revers = 0;
	    	int t=l;
	    	while(t!=0) {
	    		int rem=t%10;
	    		revers=rem+revers*10;
	    		t=t/10;
	    	}
	    	int s=Math.abs(l-revers);
	    	if((s%k)==0)
	    		count++;
		}
    	return count;
    }
}

public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) {
//	   System.out.println(Result3.beautifulDays(20, 23, 6));
	   System.out.println(Result3.beautifulDays(13, 45, 3));
	   
//	   13 45 3

	}
}
