package com.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result4 {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> list = new ArrayList<Integer>();

//		for (int i = 0; i < grades.size(); i++) {
//			if (grades.get(i) % 5 >= 3 && grades.get(i) > 38) {
//				list.add(grades.get(i) + 5 - grades.get(i) % 5);
//			} else {
//				list.add(grades.get(i));
//			}}
//			return list;
			

    	for (int i = 0; i < grades.size(); i++) {
    		int temp = grades.get(i)%5;
			if (temp>=3 && grades.get(i)>=38) {
				temp = 5-temp;
				list.add(grades.get(i)+temp);
			}else {
				list.add(grades.get(i));
			}
		}
    	return list ;
		}
}

public class GradingStudents {

	public static void main(String[] args) {
		System.out.println(Result4.gradingStudents(Arrays.asList(75, 67, 40, 33)));
	}
}
