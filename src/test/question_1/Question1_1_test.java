package test.question_1;

import main.question_1.Question1_1;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Question1_1_test {

    @Test
    public void testAllDistinct() {
        Question1_1 sut = new Question1_1();

        assertTrue(sut.isUnique("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testOneCommon() {
        Question1_1 sut = new Question1_1();

        assertFalse(sut.isUnique("abcdefaghi"));
    }

    @Test
    public void testNoUnique() {
        Question1_1 sut = new Question1_1();

        assertFalse(sut.isUnique("aaaaaaaaaaaa"));
    }
}