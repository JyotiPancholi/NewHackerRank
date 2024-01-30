package com.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Result5 {

    public static String gridChallenge(List<String> grid) {
		grid = grid.stream().map(s -> {
			char ch[]=s.toCharArray();
			Arrays.sort(ch);
			return new String(ch);
		}).collect(Collectors.toList());
		
		 for (int i = 0; i < grid.get(0).length(); i++) {
             for (int j = 0; j < grid.size()-1; j++) {
                 if (grid.get(j).charAt(i) > grid.get(j+1).charAt(i)) {
                     return "NO";
                 }
             }
         }
         return "YES";
    	
    }
}

public class GridChallenge {

	public static void main(String[] args) {
		
     System.out.println(Result5.gridChallenge(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv")));
	}
}
