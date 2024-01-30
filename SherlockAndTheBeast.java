package com.day17;

class Result8 {
    public static void decentNumber(int n) {
    	int numFives = n;
        while (numFives % 3 != 0) {
            numFives -= 5;
        }

        if (numFives < 0) {
            System.out.println("-1");
            return;
        }

        int numThrees = n - numFives;

        StringBuilder decentNumber = new StringBuilder();
        for (int i = 0; i < numFives; i++) {
            decentNumber.append('5');
        }
        for (int i = 0; i < numThrees; i++) {
            decentNumber.append('3');
        }

        System.out.println(decentNumber.toString());

    }
}

public class SherlockAndTheBeast {

	public static void main(String[] args) {
		int n = 1; 

        Result8.decentNumber(n);
	}
}
