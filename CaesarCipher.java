package com.day6;
class Result4 {



    public static String caesarCipher(String s, int k) {
    // Write your code here
    	String str="";
    	
    	for(int i=0;i<s.length();i++) {
    		
    		int t=s.charAt(i);
    		if(t>=97 && t<=122 ) {
    			t=t+k;
    			if(t>122 )
    				t=t-26;
//    			str=str+((char)t);
    		}
    		else if(t>=65 && t<=90) {
    			t=t+k;
    			if( t>90)
    				t=t-26;
    				
    		}
    		 
    			
    			str=str+(char)t;
    	}
    	
    	return str;

    }

}
public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Result4.caesarCipher("middle-Outz", 2));

	}

}
