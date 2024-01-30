package com.day16;

class Result1 {
    public static int palindromeIndex(String s) {
    	
    	 for(int x=0;x<=(s.length()-1)/2;x++)
         {   
             if(s.charAt(x)!=s.charAt(s.length()-1-x))
             {
                 if(s.charAt(x+1)==s.charAt(s.length()-1-x)&&s.charAt(x+2)==s.charAt(s.length()-2-x))
                 {
                     return x;
                 }
                 if(s.charAt(x)==s.charAt(s.length()-2-x))
                 {
                     return s.length()-x-1;
                 }
             }
         }
         return -1;
//    	int left = 0;
//        int right = s.length() - 1;
//
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                if (isPalindrome(s.substring(left, right))) {
//                    return right;
//                } else if (isPalindrome(s.substring(left + 1, right + 1))) {
//                    return left;
//                } else {
//                    return -1; // Cannot make a palindrome by removing one character
//                }
//            }
//            left++;
//            right--;
//        }
//
//        return -1; 
//    }
//
//    public static boolean isPalindrome(String s) {
//        int length = s.length();
//        for (int i = 0; i < length / 2; i++) {
//            if (s.charAt(i) != s.charAt(length - i - 1)) {
//                return false;
//            }
//        }
//        return true;
    }
}

public class PalindromeIndex {

	public static void main(String[] args) {
		System.out.println(Result1.palindromeIndex("aaab"));
	}
}
