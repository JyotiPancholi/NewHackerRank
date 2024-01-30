package com.day20;

import java.math.BigInteger;

class Result5 {
	public static long flippingBits(long n) {
       
		long mask = (1L << 32) - 1;
		
		return n^mask;
		
//		String str = "";
//		while (n > 0) {
//			long number = n % 2;
//			n = n / 2;
//			str = number+str;
//		}
//		System.out.println(str);
//		System.out.println(Long.parseUnsignedLong(str));
//		Long l = Long.parseUnsignedLong(str,2);
//		System.out.println(l);
//		return n;
	}
}

public class FlippingBits {

	public static void main(String[] args) {
		System.out.println(Result5.flippingBits(4294967295L));
		System.out.println(Result5.flippingBits(2147483647L));
	}
}
