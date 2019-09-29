package main.question_1;

public class Question1_7 {

    public int[][] rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || (matrix[0].length != matrix.length)) {
            return matrix;
        }

        int[][] result = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }

        return result;
    }
}
