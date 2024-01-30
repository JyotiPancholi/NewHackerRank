package com.day3;

import java.util.Arrays;
import java.util.List;

class Result6 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    
    	double p=0,n=0,z=0;
    	for (Integer i : arr) {
			if(i>0) {
				p+=1;
			}
			else if(i<0)
				n+=1;
			else
				z+=1;
				
		}
    	System.out.println(p/arr.size());
    	System.out.println(n/arr.size());
    	System.out.println(z/arr.size());

    }

}
public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result6.plusMinus(Arrays.asList(-4, 3, -9, 0, 4 ));
	}

}
