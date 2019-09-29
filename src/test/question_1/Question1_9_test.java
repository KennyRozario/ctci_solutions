package test.question_1;

import main.question_1.Question1_9;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Question1_9_test {

    @Test
    public void testSampleRotation() {
        Question1_9 sut = new Question1_9();

        assertTrue(sut.isRotation("waterbottle", "erbottlewat"));
    }
}
