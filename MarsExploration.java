package com.day8;

class Result1 {

    public static int marsExploration(String s) {
    	int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='S' && i%3==0) count++;
            else if(s.charAt(i)!='O' && i%3==1) count++;
            else if(s.charAt(i)!='S' && i%3==2) count++;
        } 
        return count;
    	
//    	int result = 0;
//        String base = "SOS";
//        for(int i = 0; i < s.length(); i++) {
//         if(s.charAt(i) != base.charAt(i%3)) result++;
//        }
//        return result;
    }

}
public class MarsExploration {

	public static void main(String[] args) {
		
		System.out.println(Result1.marsExploration("SOSTOT"));//SOSSPSSQSSOR
//		System.out.println(Result1.marsExploration("SOSSPSSQSSOR"));//SOSSOT
//		System.out.println(Result1.marsExploration("SOSSOT"));
	}

}
