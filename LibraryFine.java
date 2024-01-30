package com.day6;

class Result2 {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    	if (y1 > y2)
            return 10000;
        if (y1 < y2)
            return 0;
        if (m1 > m2)
            return (m1 - m2)*500;
        if (m1 < m2)
            return 0;
        if (d1 > d2)
            return (d1 - d2)*15;
        else
            return 0;
//======================================================================    	
//    	int fine = 0;
//        if (y1 == y2)
//        {
//            if (m1 == m2)
//            {
//                if (d1 > d2)
//                {
//                   return fine = 15 * (d2 - d1);
//                }
//            }
//            else if (m1 > m2)
//            {
//            	return   fine = 500 * (m2 - m1);
//            }
//        }
//        else if (y1 > y2)
//        {
//        	return  fine = 10000;
//        }
//
//        return fine;
//==================================================================
//    	if (y2 < y1 || (y2 == y1 && m2 < m1) || (y2 == y1 && m2 == m1 && d2 <= d1)) {
//            return 0; 
//        } else if (y2 == y1 && m2 == m1) {
//            return 15 * (d2 - d1);
//        } else if (y2 == y1 && m2 > m1) {
//            return 500 * (m2 - m1);
//        } else {
//            return 10000; 
//        }
    }
}

public class LibraryFine {

	public static void main(String[] args) {
		int result = Result2.libraryFine(9, 6, 2015, 6, 6, 2015);
		System.out.println(result);
	}

}
