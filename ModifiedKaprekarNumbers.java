package com.day17;

class Result7 {
	 public static void kaprekarNumbers(int p, int q) {
			
			boolean flag = false;
		    while (p <= q){
		        int d = String.valueOf(p).length();
		        
		        int base = (int) Math.pow(10, d);
		        long pow = (long)Math.pow(p, 2);
		        long mod = pow % base;
		        long div = (pow - mod) / base;
		        if (div + mod == p){
		            System.out.printf("%d ", p);
		            flag = true;
		        }
		        p++;
		    }
		    if(!flag){
		        System.out.print("INVALID RANGE");
		    }
	 }
}
public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		Result7.kaprekarNumbers(1, 100);
	}
}
