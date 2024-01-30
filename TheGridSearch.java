package com.day21;

import java.util.List;

class Result4 {

    public static String gridSearch(List<String> G, List<String> P) {
    	for (int i = 0; i <= G.size() - P.size(); i++) {
            for (int j = 0; j <= G.get(0).length() - P.get(0).length(); j++) {
                if (G.get(i).substring(j, j + P.get(0).length()).equals(P.get(0))) {
                    boolean patternFound = true;
                    for (int k = 1; k < P.size(); k++) {
                        if (!G.get(i + k).substring(j, j + P.get(0).length()).equals(P.get(k))) {
                            patternFound = false;
                            break;
                        }
                    }
                    if (patternFound) {
                        return "YES";
                    }
                }
            }
        }
        return "NO";
    }
}

public class TheGridSearch {

	public static void main(String[] args) {

	}
}
