package com.day14;

class Result7 { // x //y
	public static long taumBday(int b, int w, int bc, int wc, int z) {
		
		long costBlack = Math.min(bc, wc + z);
		long costWhite = Math.min(wc, bc + z);

		long totalCost = (b * costBlack) + (w * costWhite);

		return totalCost;
	}
}
//    	 long costB = 0;
//         long costW = 0;
//         if( bc+z < wc) {
//             costW = (bc+z)*w;
//         }
//         else {
//             costW = wc*w;
//         }
//        
//         if (wc+z <bc) {
//             costB = (wc+z)*b;
//         }
//         else {
//             costB = bc*b;
//         }
//    	return costB+costW;
//    }

public class TaumAndBday {

	public static void main(String[] args) {
		System.out.println(Result7.taumBday(3, 5, 3, 4, 1));
	}
}
