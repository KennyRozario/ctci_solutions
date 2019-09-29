package main.question_1;

public class Question1_5 {

    public boolean isOneAway(String a, String b) {
        if (Math.abs(a.length() - b.length()) > 1) {
            return false;
        }

        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        int i = 0, j = 0;
        boolean oneDiff = false;
        if (a.length() == b.length()) {
            while (i < a.length()) {
                if (a.charAt(i) != b.charAt(j)) {
                    if (oneDiff) {
                        return false;
                    } else {
                        oneDiff = true;
                    }
                }

                i++;
                j++;
            }
        } else {
            while (j < b.length()) {
                if (a.charAt(i) != b.charAt(j)) {
                    if (oneDiff) {
                        return false;
                    } else {
                        oneDiff = true;
                        i++;
                    }
                } else {
                    i++;
                    j++;
                }
            }
        }

        return true;
    }
}
