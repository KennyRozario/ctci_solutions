package main.question_1;

import java.util.HashMap;
import java.util.Map;

public class Question1_4 {

    public boolean isPalindromePermutation(String str) {

        str = str.toLowerCase();
        Map<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int count = characters.getOrDefault(current, 0);
            characters.put(current, count + 1);
        }

        boolean hasOneOdd = false;

        for (Character c : characters.keySet()) {
            int count = characters.get(c);
            if (count % 2 != 0) {
                if (hasOneOdd) {
                    return false;
                } else {
                    hasOneOdd = true;
                }
            }
        }

        return (str.length() % 2 == 0 && !hasOneOdd) || (str.length() % 2 != 0 && hasOneOdd);
    }
}
