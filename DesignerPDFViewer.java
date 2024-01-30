package com.day13;

import java.util.Arrays;
import java.util.List;

class Result4 {

    public static int designerPdfViewer(List<Integer> h, String word) {
    	int maxHeight = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int charIndex = c - 'a';
            int charHeight = h.get(charIndex);
            maxHeight = Math.max(maxHeight, charHeight);
        }

        int area = maxHeight * word.length();
        return area;
    }
}

public class DesignerPDFViewer {

	public static void main(String[] args) {
		System.out.println(Result4.designerPdfViewer(Arrays.asList(1 ,3, 1 ,3 ,1, 4, 1, 3, 2, 5 ,5 ,5 ,5 ,5, 5, 5, 5 ,5 ,5 ,5, 5, 5, 5 ,5 ,5 ,7), "zaba"));
	}
}
