package main.question_1;

import java.util.HashMap;
import java.util.Map;

public class Question1_2 {

    public boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> characterCount = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char currentCharacter = a.charAt(i);
            int count = characterCount.getOrDefault(currentCharacter, 0);
            characterCount.put(currentCharacter, count + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char currentCharacter = b.charAt(i);
            int count = characterCount.getOrDefault(currentCharacter, 0);
            characterCount.put(currentCharacter, count - 1);
        }

        for (Character key : characterCount.keySet()) {
            if (characterCount.get(key) != 0) {
                return false;
            }
        }

        return true;
    }
}
