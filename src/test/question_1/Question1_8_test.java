package test.question_1;

import main.question_1.Question1_8;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Question1_8_test {

    @Test
    public void testNullify() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 0, 16}};

        int[][] result = new int[][]{
                {1, 0, 0, 4},
                {0, 0, 0, 0},
                {9, 0, 0, 12},
                {0, 0, 0, 0}};

        Question1_8 sut = new Question1_8();

        assertThat(sut.nullify(matrix), equalTo(result));
    }
}
