package test.question_1;

import main.question_1.Question1_6;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Question1_6_test {

    @Test
    public void testCompressValidCompression() {
        Question1_6 sut = new Question1_6();

        assertEquals("a2b1c5a3", sut.compress("aabcccccaaa"));
    }

    @Test
    public void testCompressOriginalIsShorter() {
        Question1_6 sut = new Question1_6();

        assertEquals("abcd", sut.compress("abcd"));
    }

    @Test
    public void testCompressEqualAfter() {
        Question1_6 sut = new Question1_6();

        assertEquals("aabbccdd", sut.compress("aabbccdd"));
    }
}
