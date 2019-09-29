package main.question_1;

public class Question1_6 {

    public String compress(String str) {
        StringBuilder compressedString = new StringBuilder();

        char prev = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if (prev == current) {
                count++;
            } else {
                compressedString.append(prev);
                compressedString.append(count);
                prev = current;
                count = 1;
            }
        }

        compressedString.append(prev);
        compressedString.append(count);

        return compressedString.length() < str.length() ? compressedString.toString() : str;
    }
}
