package com.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result12 {
	 public static String organizingContainers(List<List<Integer>> container) {
		 int[] arr1=new int[container.size()];
		 int arr2[]=new int[container.size()];
		 for(int i=0;i<arr1.length;i++) {
			 for(int j=0;j<arr1.length;j++) {
				 arr1[j]=arr1[j]+container.get(i).get(j);
				 arr2[i]=arr2[i]+container.get(i).get(j);
			 }
		 }
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 for(int i=0;i<arr1.length;i++) {
			 if(arr1[i]!=arr2[i]) {
				 return "Impossible";
			 }
		 }
		 return "Possible";
	 }
}
public class OrganizingContainersOfBalls {

	public static void main(String[] args) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
//		list.add(Arrays.asList(1,3,1));
//		list.add(Arrays.asList(2,1,2));
//		list.add(Arrays.asList(3,3,3));
		
		list.add(Arrays.asList(0,2,1));
		list.add(Arrays.asList(1,1,1));
		list.add(Arrays.asList(2,0,0));
		
		System.out.println(Result12.organizingContainers(list));
	}
}
