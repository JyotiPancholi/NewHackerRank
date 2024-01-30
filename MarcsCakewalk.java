package com.day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result5 {


	  public static long marcsCakewalk(List<Integer> calorie) {

		  long sum=0;
		  Collections.sort(calorie,Collections.reverseOrder());
		  for(int i=0;i<calorie.size();i++) {
			  sum=(long) (sum+(Math.pow(2, i)*calorie.get(i)));
		  }
		  return sum;
	  }

}
public class MarcsCakewalk {

	public static void main(String[] args) {

			System.out.println(Result5.marcsCakewalk(Arrays.asList(5,10,7)));

	}

}
