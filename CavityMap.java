package com.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result4 {

    public static List<String> cavityMap(List<String> grid) {
    	int n = grid.size();
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = grid.get(i).toCharArray();
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                char cell = matrix[i][j];
                char top = matrix[i - 1][j];
                char bottom = matrix[i + 1][j];
                char left = matrix[i][j - 1];
                char right = matrix[i][j + 1];

                if (cell > top && cell > bottom && cell > left && cell > right) {
                    matrix[i][j] = 'X';
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (char[] row : matrix) {
            result.add(new String(row));
        }

        return result;


    }
}

public class CavityMap {

	public static void main(String[] args) {
		System.out.println(Result4.cavityMap(Arrays.asList("1112", "1912", "1892", "1234")));
	}
}
