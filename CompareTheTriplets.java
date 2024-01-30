package com.day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result1 {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	List<Integer> list = new ArrayList<Integer>(); 
    	int aliceScore =0;
    	int bobScore =0;
    	for (int i = 0; i < a.size(); i++) {
				if (a.get(i)>b.get(i)) {
					aliceScore ++;
				}else if (a.get(i)<b.get(i)) {
					bobScore++;
				}
		}
    	list.add(aliceScore);
    	list.add(bobScore);
    	return list;
    }
}

public class CompareTheTriplets {

	public static void main(String[] args) throws IOException {
		  List l1 = new ArrayList<>();
		  List l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(3);
        l2.add(2);
        l2.add(1);
        
        List<Integer> result = Result1.compareTriplets(l1, l2);
        System.out.println(result);
        
    }
}
