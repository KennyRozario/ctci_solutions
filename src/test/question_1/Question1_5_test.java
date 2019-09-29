package test.question_1;

import main.question_1.Question1_5;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Question1_5_test {

    @Test
    public void testBHasDeletedCharacter() {
        Question1_5 sut = new Question1_5();

        assertTrue(sut.isOneAway("pale", "ple"));
    }

    @Test
    public void testAHasAddedCharacter() {
        Question1_5 sut = new Question1_5();

        assertTrue(sut.isOneAway("pales", "pale"));
    }

    @Test
    public void testSameLengthOneDiff() {
        Question1_5 sut = new Question1_5();

        assertTrue(sut.isOneAway("pale", "bale"));
    }

    @Test
    public void testSameLengthTwoDiffs() {
        Question1_5 sut = new Question1_5();

        assertFalse(sut.isOneAway("pale", "bake"));
    }

    @Test
    public void testMoreThanOneCharacterLengthDifference() {
        Question1_5 sut = new Question1_5();

        assertFalse(sut.isOneAway("big", "bigger"));
    }
}
