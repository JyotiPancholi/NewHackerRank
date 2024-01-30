package com.day10;

class Result1 {
	static String catAndMouse(int x, int y, int z) {
		int cat1Steps = Math.abs(x - z);
		int cat2Steps = Math.abs(y - z);
		if (cat1Steps == cat2Steps) {
			return "Mouse c";
		} else if (cat1Steps< cat2Steps) {
			return "Cat A";
		} else {
			return "Cat B";
		}
	}
}

public class CatsAndaMouse {

	public static void main(String[] args) {
		System.out.println(Result1.catAndMouse(2, 5, 4));
	}

}
