package com.day21;

class Result9 {
    public static String isValid(String s) {
    	int[] charCount = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;
        int maxCountFrequency = 0;
        int minCountFrequency = 0;

        for (int count : charCount) {
            if (count == 0) continue;

            if (count > maxCount) {
                maxCount = count;
                maxCountFrequency = 1;
            } else if (count == maxCount) {
                maxCountFrequency++;
            }

            if (count < minCount) {
                minCount = count;
                minCountFrequency = 1;
            } else if (count == minCount) {
                minCountFrequency++;
            }
        }

        if (maxCount == minCount) {
            return "YES"; // All characters have the same frequency.
        } else if ((maxCount - minCount == 1 && maxCountFrequency == 1) || (minCount == 1 && minCountFrequency == 1 && maxCountFrequency > 1) || (maxCount - minCount == 0 && maxCountFrequency == 1)) {
            return "YES"; // It's valid after removing a character.
        } else {
            return "NO";
        }

//    	Map<Character, Integer> map = new HashMap<>();
//        
//        for(char letter : s.toCharArray())
//        {
//            if(map.containsKey(letter))
//                map.put(letter, map.get(letter) + 1);
//            else
//                map.put(letter, 1);
//        }
//        Set<Integer> set = new HashSet<>();
//        for(int i : map.values())
//        {
//            set.add(i);
//        }
//        if(set.size()>2)
//        	return "NO";
//        if(set.size()==1)
//        	return "YES";
//        else {
//        	  int f1 = 0;
//              int f2 = 0;
//              int f1Count = 0;
//              int f2Count = 0;
//              int i = 0;
//              for(int n : set)
//              {
//                  if(i == 0) f1 = n;
//                  else f2 = n;
//                  i++;
//              }
//              
//              for(int freq : map.values())
//              {
//                  if(freq == f1) f1Count++;
//                  if(freq == f2) f2Count++;
//              }
//              
//              
//              
//              if((f1 == 1 && f1Count == 1 ) || (f2 == 1 && f2Count == 1 ))
//                  System.out.println("YES");
//              else if ((Math.abs(f1 - f2)  == 1) && (f1Count == 1 || f2Count == 1))
//                  System.out.println("YES");
//              else
//                  System.out.println("NO");
//        }
//        
//    	return s;
    }
}

public class SherlockAndTheValidString {

	public static void main(String[] args) {
		System.out.println(Result9.isValid("aabbcd"));
	}
}
