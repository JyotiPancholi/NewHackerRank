package com.day1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
    	int count=0 ;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (Integer integer : ar) {
    		if (!map.containsKey(integer)) {
				map.put(integer, 1);
			}else {
				map.put(integer, map.get(integer)+1);
			}
		}
    	for (Map.Entry<Integer, Integer> obj : map.entrySet()) {
    		int c = obj.getValue()/2;
			count = count + c;
		}
		return count;
    }

}
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(Collectors.toList());
//
//        int result = Result.sockMerchant(n, ar);
//         System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();


        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(1);
        ar.add(1);
        ar.add(2);
        ar.add(2);
        ar.add(2);
        ar.add(12);
        ar.add(13);
        int result = Result.sockMerchant(ar.size(), ar);
         System.out.println(result);

	}
}
