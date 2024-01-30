package com.day7;

class Result2 {

    public static String dayOfProgrammer(int year) {
    	 if (year == 1918)
             return "26.09.1918";
         else if (((year <= 1917) && (year%4 == 0)) || ((year%400 == 0) || ((year%4 ==0) & (year%100 != 0))))
             return "12.09." + year;
         else
             return "13.09." + year;
    }
}
public class DayOfTheProgrammer {

	public static void main(String[] args) {
		System.out.println(Result2.dayOfProgrammer(1917));
	}

}
