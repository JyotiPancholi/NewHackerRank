package com.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Result5 {
    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {
        List<Integer> result = new ArrayList<>();

        for (List<Integer> caseEntryExit : cases) {
            int entry = caseEntryExit.get(0);
            int exit = caseEntryExit.get(1);

            // Check if entry and exit points are within bounds
            if (entry >= 0 && entry < width.size() && exit >= 0 && exit < width.size()) {
                int min_width = Integer.MAX_VALUE;

                for (int i = entry; i <= exit; i++) {
                    int currentWidth = width.get(i);
                    if (currentWidth < min_width) {
                        min_width = currentWidth;
                    }
                }

                result.add(min_width);
            } else {
                // Handle the case when entry or exit is out of bounds
                result.add(0); // You can choose an appropriate value in this case
            }
        }

        return result;
    }
}

public class ServiceLane {
    public static void main(String[] args) {
        List<Integer> width = new ArrayList<>(Arrays.asList(2, 3, 2, 1));
        List<List<Integer>> cases = new ArrayList<>();
        cases.add(Arrays.asList(1, 2));
        cases.add(Arrays.asList(2, 3)); // Adjust the entry and exit points as needed

        List<Integer> result = Result5.serviceLane(width.size(), cases, width);

        for (int widthResult : result) {
            System.out.println(widthResult);
        }
    }
}
//class Result5 {
//    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {
//        List<Integer> result = new ArrayList<>();
//
//        for (List<Integer> caseEntryExit : cases) {
//            int entry = caseEntryExit.get(0);
//            int exit = caseEntryExit.get(1);
//            int min_width = Integer.MAX_VALUE;
//
//            for (int i = entry; i <= exit; i++) {
//                int currentWidth = width.get(i);
//                if (currentWidth < min_width) {
//                    min_width = currentWidth;
//                }
//            }
//
//            result.add(min_width);
//        }
//
//        return result;
//    }
//}
//
//public class ServiceLane {
//    public static void main(String[] args) {
//        int n = 4;
//        List<Integer> width = new ArrayList<>(Arrays.asList(2, 3, 2, 1));
//        List<List<Integer> > cases = new ArrayList<>();
//        cases.add(Arrays.asList(1, 2));
//        cases.add(Arrays.asList(2, 4));
//
//        List<Integer> result = Result5.serviceLane(n, cases, width);
//
//        for (int i : result) {
//            System.out.println(i);
//        }
//    }
//}
