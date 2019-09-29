package main.question_1;

public class Question1_3 {

    public String urlify(String url) {
        int trueLength = url.length();
        int index = trueLength - 1;

        char[] urlChars = url.toCharArray();

        for (int i = trueLength - 1; i >= 0; i--) {
            if (urlChars[i] != ' ') {
                index = i;
                break;
            }
        }

        int i = index;
        int j = trueLength - 1;

        while (i >= 0) {
            char current = urlChars[i];

            if (current == ' ') {
                urlChars[j] = '0';
                urlChars[j - 1] = '2';
                urlChars[j - 2] = '%';
                j -= 3;
            } else {
                urlChars[j] = current;
                j--;
            }

            i--;
        }

        return new String(urlChars);
    }
}
