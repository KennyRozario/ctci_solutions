package test.question_1;

import main.question_1.Question1_3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Question1_3_test {

    @Test
    public void testSampleSolution() {
        Question1_3 sut = new Question1_3();

        assertEquals("Mr%20John%20Smith", sut.urlify("Mr John Smith    "));
    }
}
