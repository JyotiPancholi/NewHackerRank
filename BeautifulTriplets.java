package com.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result8 {
	public static int countBeautifulTriplets(List<Integer> list, int d) {

		int ans = 0;
        Set<Integer> set=new HashSet<Integer>(list);
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i)+d) && set.contains(list.get(i)+2*d))
                ans++;
        }
        return ans;
	}
}

public class BeautifulTriplets {

	public static void main(String[] args) {
		System.out.println(Result8.countBeautifulTriplets(Arrays.asList(2, 2, 3, 4, 5), 1));
	
		
	}
}
