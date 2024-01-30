package com.day6;

class Result3 {

    public static String timeConversion(String s) {
		String arr[] =  s.split(":");
		String str = arr[2].substring(2,4);
		int hours = Integer.parseInt(arr[0]);
		int minut = Integer.parseInt(arr[1]);
		int second = Integer.parseInt(arr[2].substring(0,2));
		if (s.contains("PM")&& hours != 12) {
			hours+=12;
		}
		if (s.contains("AM") && hours ==12 ) {
			hours =0;
		}
		String string =String.format("%02d:%02d:%02d", hours,minut,second);
   return string;
//    
//    
//        String arr[] =  s.split(":");
//      String str = arr[2].substring(2,4);
//      int hours = Integer.parseInt(arr[0]);
//      int minut = Integer.parseInt(arr[1]);
//      int second = Integer.parseInt(arr[2].substring(0,2));
//      if (str.equals("AM") && hours == 12) {
//          hours=0;
//      }else if (str.equals("PM") && hours <12 ) {
//          hours =hours+12;
//      }
//     String string="";
//      if(hours<10) {
//          string=string+"0"+hours+":";
//      }
//      else {
//          string=string+hours+":";
//      }
//      if(minut<10) {
//          string=string+"0"+minut+":";
//      }
//      else {
//          string=string+minut+":";
//      }
//      if(second<9)
//          string=string+"0"+second;//+str;
//      else
//          string=string+second;//+str;
//      return string;

    }

}
public class TimeConversion {

	public static void main(String[] args) {
		System.out.println(Result3.timeConversion("12:01:00PM"));
	}

}
