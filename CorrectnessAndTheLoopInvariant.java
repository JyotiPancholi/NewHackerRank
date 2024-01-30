package com.day18;

class Result8 {
	 public static void insertionSort(int[] A){
	        for(int i = 1; i < A.length; i++){
	            int value = A[i];
	            int j = i - 1;
	            while(j >= 0 && A[j] > value){
	                A[j + 1] = A[j];
	                j = j - 1;
	            }
	            A[j + 1] = value;
	            printArray(A);
	        }

	        printArray(A);
	    }


	    static void printArray(int[] ar) {
	        for(int n: ar){
	            System.out.print(n+" ");
	        }
	        System.out.println();
	    }
}
public class CorrectnessAndTheLoopInvariant {
	
	    public static void main(String[] args) {
	       
	        Result8.insertionSort(new int[]{7, 4, 3, 5, 6, 2});
	    }
}
