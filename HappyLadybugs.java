package com.day18;

import java.util.HashMap;
import java.util.Map;

class Result1 {
	public static String happyLadybugs(String b) {

		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < b.length(); i++) {
			if (hashMap.containsKey(b.charAt(i))) {
				hashMap.put(b.charAt(i), hashMap.get(b.charAt(i)) + 1);
			} else {
				hashMap.put(b.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() < 2 && !entry.getKey().equals('_')) {
				return "NO";
			}
		}
		if (!hashMap.containsKey('_')) {
			char last = b.charAt(0);
			int count = 1;

			for (int i = 1; i < b.length(); i++) {
				char curr = b.charAt(i);

				if (curr == last) {
					count++;
				} else {
					if (count < 2) {
						return "NO";
					}
					count = 1;
				}

				last = curr;
			}
			return "YES";
		} else {
			return "YES";
		}
	}
}
//----------------------------------------------------------------------------------------
//		 static boolean areLadybugsHappy(String b) {
//			for (char ladybug : b.toCharArray()) {
//				if (ladybug != '_' && b.indexOf(ladybug) == b.lastIndexOf(ladybug)) {
//					return false;
//				}
//			}
//			return true;
//		}

//		if (areLadybugsHappy(b)) {
//			return "YES";
//		}
//
//		if (b.contains("_")) {
//			return "YES";
//		}
//
//		for (int i = 0; i < b.length(); i++) {
//			char ladybug = b.charAt(i);
//			if (ladybug != '_') {
//				int count = 0;
//				while (i < b.length() && b.charAt(i) == ladybug) {
//					count++;
//					i++;
//				}
//				if (count == 1) {
//					return "NO"; // A ladybug without a pair can't be made happy
//				}
//			}
//		}
//
//		return "YES";

//----------------------------------------------------------------------------------------

//        int[] charCount = new int[26];
//        boolean hasEmptyCell = false;
//        for (char c : b.toCharArray()) {
//            if (c != '_') {
//                charCount[c - 'A']++;
//            } else {
//                hasEmptyCell = true;
//            }
//        }
//        for (char c : b.toCharArray()) {
//            if (c != '_') {
//                if (charCount[c - 'A'] == 1) {
//                    return "NO";
//                }
//            }
//        }
//        if (hasEmptyCell || b.length() == 1) {
//            return "YES";
//        }
//
//        return "NO";

public class HappyLadybugs {

	public static void main(String[] args) {
		System.out.println(Result1.happyLadybugs("AABBC"));
	}

}
