package com.day10;

class Result2 {

    public static int saveThePrisoner(int n, int m, int s) {

    	
    	int prisonerId = (s + (m - 1)) % n;
		
		return prisonerId == 0 ? n : prisonerId;
    	
    	
    	
    	//Correct Ans but timeout error
    	//    	if(n>m ) {
//    		if(s==1)
//    			return m;
//    		else
//    			return s+m-1;
//    	}
//    	int g=n-s+1;
//    	m-=g;
//    	int index=0;
//    	 do{
//    		m--;
//    		index=(index+1)%n;
//    	}while(m>0);
    	
    	
    	//return index==0?n:index;
    	
    	
    	
    	
    	
//    	int chairNo = 0;
//		if (n==m) {
//			return chairNo = n;
//		}else if(m<n){
//			return chairNo =n-m;
//		}else {
//			return chairNo =  (s + (m - 1)) % n;
//		}
    	
//    	int lt, seat, lMinusN;
//        int reminder = m % n;
//
//        if (s == 1) {
//            if (reminder == 0) {
//                seat = n;
//            } else {
//                seat = reminder;
//            }
//
//        } else {
//            lt = s - 1;
//
//            if (reminder == 0) {
//
//                seat = lt;
//            }
//            else {
//                int temp = lt + reminder;
//                if (temp <= n) {
//                    seat = temp;                 
//                } else {
//
//                    lMinusN = Math.abs(lt - n);
//                    seat = reminder - lMinusN;
//
//                }
//            }
//
//        }
//		return reminder;

//		int remainder = (m - 1) % n;
//		int awfulCandyChair = (s - 1 + remainder) % n + 1;
//		return awfulCandyChair;
    }
}

public class SaveThePrisoner {

	public static void main(String[] args) {
	System.out.println(Result2.saveThePrisoner(3, 7, 3));
	}

}
