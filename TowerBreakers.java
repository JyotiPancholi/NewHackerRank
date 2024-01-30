package com.day7;

class Result1 {

    public static int towerBreakers(int n, int m) {
	
    	if (m== 1 || n%2 ==0)
            return 2;
        else
            return 1;	
    }

}

public class TowerBreakers {

	public static void main(String[] args) {
		System.out.println(Result1.towerBreakers(1, 4)); 
	}

}
