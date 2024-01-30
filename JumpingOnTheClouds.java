package com.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result2 {

    public static int jumpingOnClouds(List<Integer> c) {
    	int count =0;
    	for (int i = 0; i < c.size()-1; i++) {
			if (c.get(i)==0) {
				if (c.get(i)== c.get(i+1)) {
					count++;
					i++;
				}
			}else {
				count ++;
			}
		}
		return count;
    }
}

public class JumpingOnTheClouds {

	public static void main(String[] args) {
      System.out.println(Result2.jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0, 1, 0)));
      System.out.println(Result2.jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0, 1, 0)));
      System.out.println(Result2.jumpingOnClouds(Arrays.asList(0, 1,0, 0, 0, 1, 0)));
      System.out.println(Result2.jumpingOnClouds(Arrays.asList(0,0,1, 0, 0, 1, 0)));
      System.out.println(Result2.jumpingOnClouds(Arrays.asList(0, 0 ,0 ,0 ,1 ,0)));
	}
}
