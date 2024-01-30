package com.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result10 {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    	Set<Integer> scoreSet = new HashSet<Integer>();
        for (int score : ranked) {
            scoreSet.add(score);
        }

        List<Integer> sortedList = new ArrayList<Integer>(scoreSet);
        Collections.sort(sortedList, Collections.reverseOrder());

        List<Integer> playerRankings = new ArrayList<>();
        int ind;
        for (int i = 0; i < player.size(); i++) {
            ind = Collections.binarySearch(sortedList, player.get(i), Collections.reverseOrder());
            if (ind < 0) {
                ind = Math.abs(ind);
            } else {
                ind++;
            }
            playerRankings.add(ind);
        }

        return playerRankings;
    }
}
public class ClimbingTheLeaderboard {

	public static void main(String[] args) {
		System.out.println(Result10.climbingLeaderboard(Arrays.asList(100,90,90,80), Arrays.asList(70,80,105)));
	}
}
