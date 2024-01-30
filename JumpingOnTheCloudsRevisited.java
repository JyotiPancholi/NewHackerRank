package com.day9;

class Result3 {
	static int jumpingOnClouds(int[] c, int k) {
		
		 int energyLevel = 100;
		 int i=k;
		   while( i != 0   ){
		      if( i >= c.length ) i = i - c.length;
		      energyLevel = energyLevel - 1;
		      if( c[i] == 1 ) energyLevel = energyLevel - 2;
		      if( i == 0 ) break;
		      
		      i+=k;
		   }
		   return energyLevel;
		   
		   
//		int i = 0;
//        int Energy = 100;
//        while(i < c.length ){
//            Energy--;
//            if(c[i]==1)
//                Energy-=2;
//            i += k;
//        }
//		return Energy;

	}
}

public class JumpingOnTheCloudsRevisited {

	public static void main(String[] args) {
		int arr[] = {0, 0, 1, 0, 0, 1, 1, 0};
		System.out.println(Result3.jumpingOnClouds(arr, 2));
	}
}
