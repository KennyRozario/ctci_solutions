package main.question_1;

import java.util.HashSet;
import java.util.Set;

public class Question1_1 {

    public boolean isUnique(String str) {
        Set<Character> existingCharacters = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);

            if (existingCharacters.contains(currentCharacter)) {
                return false;
            } else {
                existingCharacters.add(currentCharacter);
            }
        }

        return true;
    }
}
