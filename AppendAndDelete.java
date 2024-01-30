package com.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result8 {
	 public static String appendAndDelete(String s, String t, int k) {
		    // Write your code here
		 if (s.equals(t))
		        return (k >= s.length() * 2 || k % 2 == 0) ? "Yes" : "No";
		 int comLength=0;
		 for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
		        if (t.charAt(i) != s.charAt(i))
		            break;
		        comLength++;
		    }

		    int cs = s.length() - comLength;
		    int ct = t.length() - comLength;
		    int tot = cs + ct;

		    return ((tot == k) || (tot < k && (tot - k) % 2 == 0) || (tot + (2 * comLength) <= k)) ? "Yes" : "No";

	 }
}

public class AppendAndDelete {

	public static void main(String[] args) {
		
		
		System.out.println(Result8.appendAndDelete("hackerhappy", "hackerrank", 9));

	}
}
