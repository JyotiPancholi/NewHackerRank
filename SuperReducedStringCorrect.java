//package com.day3;
//
//import java.util.HashMap;
//import java.util.Map;
//
//class Result4 {
//
//    public static String superReducedString(String s) {
//    
//    	StringBuilder sb=new StringBuilder(s);
//    	int i=0;
//    	 while (!sb.isEmpty() && i < sb.length()) {
//             if (i+1 < sb.length() && sb.charAt(i) == sb.charAt(i+1)) {
//                 sb.deleteCharAt(i+1);
//                 sb.deleteCharAt(i);
//                 if (i > 0) {
//                     i--;
//                 }
//             }
//             else {
//                 i++;
//             }
//         }
//         if (sb.isEmpty()) {
//             return "Empty String";
//         }
//         return sb.toString();
//    }
//}
//
//
//public class SuperReducedStringCorrect {
//
//	public static void main(String[] args) {
//		String s= Result3.superReducedString("aabb");
//		System.out.println(s);
//	}
//}