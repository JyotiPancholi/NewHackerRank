package com.day14;

class Result5 {

    public static int chocolateFeast(int n, int c, int m) {
    	
    	int chocos=n/c;
    	  int eatenChocos=chocos;
    	 
    	  while(m<=eatenChocos){
    		  eatenChocos = eatenChocos-m;
    	    chocos++;
    	    eatenChocos++;
    	   }
    	 return chocos;
    	 
//		int chocos = n/c;
//		int eatenChocos = 0;
//		 eatenChocos += chocos;
//		 while (chocos>=m) {
//			 eatenChocos += chocos / m;
//			 chocos = (chocos / m) + (chocos % m);
//		}
//    	return eatenChocos;
    }
}

public class ChocolateFeast {

	public static void main(String[] args) {
		System.out.println(Result5.chocolateFeast(15, 3, 2));
	}
}
