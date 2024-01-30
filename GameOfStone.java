package com.day9;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class Result4 {

    /*
     * Complete the 'gameOfStones' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER n as parameter.
     */

    public static String gameOfStones(int n) {
    	
    	if(n%7==0 || n%7==1)
    		return "Second";
    	
		return "First";
    // Write your code here

    }

}
public class GameOfStone {

	public static void main(String[] args) {
		
		for(int i=1;i<8;i++) {
			System.out.println(Result4.gameOfStones(i));
		}
	}

}
