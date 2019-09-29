package test.question_1;

import main.question_1.Question1_4;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Question1_4_test {

    @Test
    public void testEvenLengthValid() {
        Question1_4 sut = new Question1_4();

        assertTrue(sut.isPalindromePermutation("abcabc"));
    }

    @Test
    public void testEvenLengthInvalid() {
        Question1_4 sut = new Question1_4();

        assertFalse(sut.isPalindromePermutation("abdabc"));
    }

    @Test
    public void testOddLengthValid() {
        Question1_4 sut = new Question1_4();

        assertTrue(sut.isPalindromePermutation("dabcabc"));
    }

    @Test
    public void testOddLengthInvalid() {
        Question1_4 sut = new Question1_4();

        assertFalse(sut.isPalindromePermutation("abaabbc"));
    }
}
