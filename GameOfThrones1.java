package com.day17;

import java.util.HashMap;
import java.util.Map;

class Result9{
    public static String gameOfThrones(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		int count =0;
		for (int frequency : map.values()) {
            if (frequency % 2 != 0) {
            	count++;
            }
        }
		
		if (count <= 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

public class GameOfThrones1 {

	public static void main(String[] args) {
       System.out.println(Result9.gameOfThrones("cdefghmnopqrstuvw"));
	}
}
