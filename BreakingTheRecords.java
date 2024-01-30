package com.day1;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

	 public static List<Integer> breakingRecords(List<Integer> scores) {
		 int minScore = scores.get(0);
	        int maxScore = scores.get(0);
	        int minRecordBreaks = 0;
	        int maxRecordBreaks = 0;

	        for (int i = 1; i < scores.size(); i++) {
	            int score = scores.get(i);

	            if (score > minScore) {
	                minScore = score;
	                minRecordBreaks++;
	            } else if (score < maxScore) {
	                maxScore = score;
	                maxRecordBreaks++;
	            }
	        }

	        return Arrays.asList(minRecordBreaks, maxRecordBreaks);

		 
//		 int highest =0;
//		 int lowest =0;
//		 int highestCount =0;
//		 int lowestCount = 0;
//		 for (Integer integer : scores) {
//			if (highest==0 && lowest==0) {
//				highest = lowest = integer;
//			}else {
//				if (integer>highest) {
//					highest=integer;
//					highestCount++;
//				} else if (integer<lowest) {
//					lowest=integer;
//					lowestCount++;
//				}
//			}
//		}
//
//
//		 return Arrays.asList(highestCount,lowestCount);
		 
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> ar =  Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
		List<Integer> ar =  Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
		
		breakingRecords(ar).stream().forEach(System.out::println);;
		
	}

}
