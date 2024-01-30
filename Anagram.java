package com.day17;

class Result5 {
    public static int anagram(String s) {
    	int n = s.length();
        if (n % 2 != 0) {
            return -1;
        }
        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2);
        int[] charCount = new int[26]; 
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            charCount[c - 'a']--;
        }
        int changesNeeded = 0;
        for (int count : charCount) {
            if (count > 0) {
                changesNeeded += count;
            }
        }

        return changesNeeded;
    	
//		int count =0;
//		int length = s.length();
//		if (length%2!=0) {
//			return -1;
//		}
//		String sb1 = s.substring(0, length/2);
//		String sb2 = s.substring(length/2,length);
//		
//		for (int i = 0; i < sb1.length() ; i++) {
//			boolean flag = true;
//			for (int j = 0; j < sb2.length(); j++) {
//				if (sb1.charAt(i)==sb2.charAt(j)) {
//					flag=false;
//					break;
//				}
//			}
//			if (flag) {
//				count++;
//			}
//		}
//    	return count;
    }
}

public class Anagram {

	public static void main(String[] args) {
		System.out.println(Result5.anagram("fdhlvosfpafhalll"));
	}
}
