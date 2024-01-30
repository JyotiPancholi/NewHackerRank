package com.day7;

import java.sql.ResultSet;

class Result5 {

    public static int minimumNumber(int n, String password) {
    	String upercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String lowercase="abcdefghijklmnopqrstuvwxyz";
    	String specialchars = "!@#$%^&*()-+";
    	String numbers = "0123456789";
    	int count=0;
    	boolean hasuper=false;
    	boolean haslower=false;
    	boolean hasspel=false;
    	boolean hasNo=false;
  
    	for(char c:password.toCharArray()) {
    		
    		if(upercase.indexOf(c) !=-1)
    			hasuper=true;
    		else if(lowercase.indexOf(c) !=-1)
    			haslower=true;
    		else if(specialchars.indexOf(c) !=-1)
    	    		hasspel= true;
    		else if(numbers.indexOf(c) !=-1)
        		hasNo=true;
    	}
    	if(!haslower)
    		count++;
    	if(!hasuper)
    		count++;
    	if(!hasspel)
    		count++;
    	if(!hasNo)
    		count++;
    	
    	return Math.max(6-n, count);
    }

}
public class StrongPassword {

	public static void main(String[] args) {
		System.out.println(Result5.minimumNumber(3, "Ab1"));
	}

}
