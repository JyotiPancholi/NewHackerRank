package com.day20;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Result6 {
	public static List<Integer> jimOrders(List<List<Integer>> orders) {
		List<SimpleEntry<Integer, Integer>> serveTimes = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {
            int orderNumber = orders.get(i).get(0);
            int prepTime = orders.get(i).get(1);
            int serveTime = orderNumber + prepTime;
            serveTimes.add(new SimpleEntry<>(i + 1, serveTime));
        }
        Collections.sort(serveTimes, Comparator.comparing(SimpleEntry::getValue));
        List<Integer> serveOrder = new ArrayList<>();
        for (SimpleEntry<Integer, Integer> entry : serveTimes) {
            serveOrder.add(entry.getKey());
        }
        return serveOrder;
		
//-----------------------------------------------------------------------------------		
//		 	List<Integer> list=new ArrayList<Integer>();
//		 	for(int j=0;j<orders.get(0).size();j++) {
//		 			list.add(orders.get(0).get(j)+orders.get(1).get(j));
//		 	}
//		 List<Integer> index=new ArrayList<Integer>();
//		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
//		for (int j = 0; j < orders.get(0).size(); j++) {
//			int sum = orders.get(0).get(j) + orders.get(1).get(j);
//			map.put(j+1,sum);
//		}
//		Map<Integer, Integer> result = map.entrySet().stream()
//				.sorted(Map.Entry.comparingByKey()) 			
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//				(oldValue, newValue) -> oldValue, LinkedHashMap::new));
//		
//		for (Map.Entry<Integer, Integer> e : result.entrySet()) {
//			index.add(e.getKey());
//		}
//		System.out.println(map);
//		return index;
	}

}

public class JimAndTheOrders {

	public static void main(String[] args) {

		List l1 = Arrays.asList(8, 4, 5, 3, 4);
		List l2 = Arrays.asList(1, 2, 6, 1, 3);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(l1);
		list.add(l2);
		Result6.jimOrders(list).stream().forEach(System.out::println);
		;
	}
}
