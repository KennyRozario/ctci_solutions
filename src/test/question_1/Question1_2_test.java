package test.question_1;

import main.question_1.Question1_2;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Question1_2_test {

    @Test
    public void testValidPermutation() {
        Question1_2 sut = new Question1_2();

        assertTrue(sut.isPermutation("abcd", "dcab"));
    }

    @Test
    public void testMismatchedLength() {
        Question1_2 sut = new Question1_2();

        assertFalse(sut.isPermutation("a", "abcd"));
    }

    @Test
    public void testNoMatchingCharacters() {
        Question1_2 sut = new Question1_2();

        assertFalse(sut.isPermutation("abcd", "efgh"));
    }

    @Test
    public void testSomeMatchingCharacters() {
        Question1_2 sut = new Question1_2();

        assertFalse(sut.isPermutation("abcd", "bcef"));
    }
}
