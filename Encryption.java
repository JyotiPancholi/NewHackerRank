package com.day21;

class Result1 {
    public static String encryption(String text) {
        text = text.replace(" ", "");

        int length = text.length();
        int rows = (int) Math.floor(Math.sqrt(length));
        int columns = (int) Math.ceil(Math.sqrt(length));

        if (rows * columns < length) {
            if (rows < columns) {
                rows++;
            } else {
                columns++;
            }
        }

        StringBuilder encodedMessage = new StringBuilder();

        for (int i = 0; i < columns; i++) {
            for (int j = i; j < length; j += columns) {
                encodedMessage.append(text.charAt(j));
            }
            encodedMessage.append(" ");
        }

        return encodedMessage.toString().trim();
    }

}

public class Encryption {

	public static void main(String[] args) {
		System.out.println(Result1.encryption("feedthedog"));
	}
}
