package com.day13;

class Result1 {
    public static int utopianTree(int n) {
		int height =1;
    	for (int i = 0; i <n; i++) {
			if (i%2==0) {
				height*=2;
			} else {
				height+=1;
			}
		}
    	return height;
    }
}

public class UtopianTree {

	public static void main(String[] args) {
		System.out.println(Result1.utopianTree(5));
	}

}
