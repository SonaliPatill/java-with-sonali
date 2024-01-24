package Sonalipractis;

import java.util.Arrays;

public class MatricsEquality 
 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        if (areMatricesEqual(matrix1, matrix2)) {
            System.out.println("Matrices are equal.");
        } else {
            System.out.println("Matrices are not equal.");
        }
    }

    private static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        return Arrays.deepEquals(matrix1, matrix2);
    }
}
