package com.day18;

import java.util.Arrays;
import java.util.List;

class Result7 {
	 public static int makingAnagrams(String s1, String s2) {
		 int counter=0;
		 for(int i=0;i< s1.length();i++) {
			 for(int j=0;j<s2.length();j++) {
				 if(s1.charAt(i)==s2.charAt(j)) {
					 counter++;
					 s1=s1.substring(0,i)+" "+s1.substring(i+1);
					 s2=s2.substring(0,j)+" "+s2.substring(j+1);
					 break;
				 }
			 }
		 }
		 
		 return s1.length()-counter+s2.length()-counter;
	 }

}
public class MakingAnagram {

	public static void main(String[] args) {
		System.out.println(Result7.makingAnagrams("cde", "abc"));
	}
}
