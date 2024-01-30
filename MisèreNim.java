package com.day14;

import java.util.Arrays;
import java.util.List;

class Result1 {
    public static String misereNim(List<Integer> s) {
    	int sum = 0;
        for (int i = 0; i < s.size(); i++) {
            //sum += s[i];
            if (s.get(i) % 2 == 1) {
                sum ^= i;            
            }
        }

        if (sum == 0) {
            return "Second";
        } else {
            return "First";
        }
//    	 int n = s.size();
//         int xorSum = 0;
//         int onesCount = 0;
//
//         for (int pile : s) {
//             xorSum ^= pile;
//             if (pile == 1) {
//                 onesCount++;
//             }
//         }
//
//         if (onesCount == n) {
//             if (n % 2 == 0) {
//                 return "First";
//             } else {
//                 return "Second";
//             }
//         } else {
//             if (xorSum == 0) {
//                 return "Second";
//             } else {
//                 return "First";
//             }
//         }
    	
    	
//    	 int n = piles.size();
//         long m = piles.stream().filter(stones -> stones == 1).count();
//
//         if (m == n - 1) { // One stone per pile except one
//             return n % 2 == 0 ? "Second" : "First";
//         }
//         return n % 2 == 0 ? "First" : "Second";
    }
}

public class MisèreNim {

	public static void main(String[] args) {
		System.out.println(Result1.misereNim(Arrays.asList(1,1)));
	}
}
