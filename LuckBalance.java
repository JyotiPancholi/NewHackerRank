package com.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result7 {
    public static int luckBalance(int k, List<List<Integer>> contests) {
    	int luck=0;
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<contests.size();i++) {
			if(contests.get(i).get(1)==0) {
				luck=luck+contests.get(i).get(0);
			}else {
				list.add(contests.get(i).get(0));
			}
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<list.size();i++) {
			if(i<k) {
				luck=luck+list.get(i);
				
			}else {
				luck=luck-list.get(i);
			}
		}
    	
    	return luck;
    }
}

public class LuckBalance {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(1,1,0));
		list.add(Arrays.asList(5,1,4));
		
		System.out.println(Result7.luckBalance(2, list));

	}
}
