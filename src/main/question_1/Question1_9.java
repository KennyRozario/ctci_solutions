package main.question_1;

public class Question1_9 {

    public boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        StringBuilder rotation = new StringBuilder();
        rotation.append(s2);
        rotation.append(s2);

        String rotatedString = rotation.toString();

        return rotatedString.contains(s1);
    }
}
