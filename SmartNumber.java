package com.day17;

class Result2 {
    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);    
        if(num * val == num)
            return true;
        return false;
    }
}
public class SmartNumber {

	public static void main(String[] args) {
		System.out.println(Result2.isSmartNumber(7));
	}
}
