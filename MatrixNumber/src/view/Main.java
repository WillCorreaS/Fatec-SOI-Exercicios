package view;

import java.util.Random;
import controller.methodos;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = Main.generateRandomMatrix(3, 5);

        for (int i = 0; i < matrix.length; i++) {
            Thread thread = new methodos(matrix[i], i);
            thread.start();
        }
    }

	private static int[][] generateRandomMatrix(int rows, int cols) {
		Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
	}
}


