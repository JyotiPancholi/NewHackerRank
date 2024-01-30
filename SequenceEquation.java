package com.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result4 {
    public static List<Integer> permutationEquation(List<Integer> p) {
    	Map<Integer,Integer> sequenceFunction = new HashMap<>();
        for(int i = 0; i < p.size(); i++)
        {
            sequenceFunction.put(p.get(i),i+1);
        }
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i = 1; i <= p.size(); i++){
//            int x = i;
//            int t = sequenceFunction.get(i);
//            int y = sequenceFunction.get(t);
//           // System.out.println(y);
//            list.add(y);
            list.add(sequenceFunction.get(sequenceFunction.get(i)));
        }
    	return list;
    }
}

public class SequenceEquation {

	public static void main(String[] args) {
		Result4.permutationEquation(Arrays.asList(5,2,1,3,4)).stream().forEach(System.out::println);
	}
}
