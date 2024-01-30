package com.day14;

import java.util.ArrayList;
import java.util.List;

class Result6 {
    public static List<Integer> acmTeam(List<String> topic) {
    	int maxTopics = 0;
        int maxTeams = 0;
        int n = topic.size();

        for (int i = 0; i < n - 1; i++) {
            String knowledge1 = topic.get(i);
            for (int j = i + 1; j < n; j++) {
                String knowledge2 = topic.get(j);
                int knownTopics = 0;

                for (int k = 0; k < knowledge1.length(); k++) {
                    if (knowledge1.charAt(k) == '1' || knowledge2.charAt(k) == '1') {
                        knownTopics++;
                    }
                }

                if (knownTopics > maxTopics) {
                    maxTopics = knownTopics;
                    maxTeams = 1;
                } else if (knownTopics == maxTopics) {
                    maxTeams++;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxTopics);
        result.add(maxTeams);
        return result;
    }
}

public class ACM_ICPC_Team {

	public static void main(String[] args) {
		List<String> topics = new ArrayList<>();
        topics.add("10101");
        topics.add("11100");
        topics.add("11010");
        topics.add("00101");
        List<Integer> result = Result6.acmTeam(topics);

        System.out.println("Maximum topics known: " + result.get(0));
        System.out.println("Number of teams knowing that many topics: " + result.get(1));

	}
}
