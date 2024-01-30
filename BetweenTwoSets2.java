package com.day3;

import java.util.Arrays;
import java.util.List;

class Result2 {

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		  int n=a.size();
		  int m=b.size();
		  int count=0;
		  
		for (int i=a.get(n-1); i<=b.get(0); i++){
	            boolean flag=true;
	            for (int j=0; j<n; j++){
	                if (i%a.get(j)!=0){
	                    flag=false;
	                    break;
	                }           
	            }
	            if (flag==true){
	                for (int j=0; j<m; j++){
	                    if (b.get(j)%i!=0){
	                        flag=false;
	                        break;
	                    }
	                }
	            }
	            if (flag==true)
	                count++;
	        }    	
		return count;
    }
}

public class BetweenTwoSets2 {

	public static void main(String[] args) {

		System.out.println(Result.getTotalX(Arrays.asList(2, 4), Arrays.asList(16,32,96)));
	}
}
