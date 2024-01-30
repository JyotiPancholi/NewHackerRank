package com.day20;

import java.util.List;

class Result9 {

    public static int formingMagicSquare(List<List<Integer>> s) {
    	int[][] inputMatrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inputMatrix[i][j] = s.get(i).get(j);
            }
        }

        int[][][] magicSquares = {
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}
        };

        int minCost = Integer.MAX_VALUE;

        for (int[][] magicSquare : magicSquares) {
            int cost = calculateCost(inputMatrix, magicSquare);
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    static int calculateCost(int[][] s, int[][] magicSquare) {
        int cost = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cost += Math.abs(s[i][j] - magicSquare[i][j]);
            }
        }
        return cost;
    }
}

public class FormingMagicSquare {

	public static void main(String[] args) {

	}
}
