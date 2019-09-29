package test.question_1;

import main.question_1.Question1_7;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Question1_7_test {

    @Test
    public void testRotate4by4Matrix() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int[][] result = new int[][]{
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}};

        Question1_7 sut = new Question1_7();

        assertThat(sut.rotateMatrix(matrix), equalTo(result));
    }
}
