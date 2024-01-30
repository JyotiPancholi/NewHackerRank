package com.day11;

import java.util.Arrays;
import java.util.List;

class Result {
	public static List<String> bigSorting(List<String> unsorted) {
		return unsorted;
		
//		 List<BigInteger> sortedList = new ArrayList<>();
//	        for (String s : unsorted) {
//	            sortedList.add(new BigInteger(s));
//	        }
//	        Collections.sort(sortedList);
//	        ArrayList<String> sortedStrings = new ArrayList<>();
//	        for (BigInteger bi : sortedList) {
//	            sortedStrings.add(bi.toString());
//	        }
//	        return sortedStrings;

		
//		List<BigInteger> sortedList = unsorted.parallelStream()
//			    .map(BigInteger::new)
//			    .collect(Collectors.toList());
//
//			Collections.sort(sortedList, BigInteger::compareTo);
//
//			return sortedList.stream()
//			    .map(BigInteger::toString)
//			    .collect(Collectors.toList());
			
//		return unsorted.parallelStream()
//			    .map(BigInteger::new)
//			    .sorted((a, b) -> a.compareTo(b))
//			    .map(BigInteger::toString)
//			    .collect(Collectors.toList());
		
//		return unsorted.parallelStream().map(s -> {
//			BigInteger i = new BigInteger(s);
//			return i;
//		}).sorted().map(s -> {
//			return String.valueOf(s);
//		}).collect(Collectors.toList());
	}
}

//    	String arr[]=(String[])unsorted.toArray();
//    	 Arrays.sort(arr, new Comparator<String>() {
//    	        public int compare(String s1, String s2) {
//    	            return compareStrings(s1, s2);
//    	        }
//    	    });
//    	 return Arrays.asList(arr);

//    	String arr[]=(String[])unsorted.toArray();
//    	Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() < o2.length()) {
//                    return -1;
//                }
//                if (o1.length() > o2.length()) {
//                    return 1;
//                }
//                return o1.compareTo(o2);
//            }
//        });

//    	return Arrays.asList(arr);

//    	return unsorted.stream().map(s->{
//    		BigInteger i=new BigInteger(s);
//    		return i;
//    	}).sorted().map(s->{
//    			return String.valueOf(s);
//    			}).collect(Collectors.toList());
//}
//private static int compareStrings(String s1, String s2) {
//    if (s1.length() < s2.length()) {
//        return -1;
//    } else if (s1.length() > s2.length()) {
//        return 1;
//    }
//    for (int k = 0; k < s1.length(); k++) {
//        if ((int) s1.charAt(k) < (int) s2.charAt(k))
//            return -1;
//        if ((int) s1.charAt(k) > (int) s2.charAt(k))
//            return 1;
//    }
//    return 0;
//}
//
//}

public class BigSorting {

	public static void main(String[] args) {

		Result.bigSorting(Arrays.asList("8", "1", "2", "100", "12303479849857341718340192371", "3084193741082937",
				"3084193741082938", "111", "200")).stream().forEach(System.out::println);
	}
}
