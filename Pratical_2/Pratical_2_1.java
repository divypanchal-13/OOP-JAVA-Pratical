
import java.util.Random;

public class Pratical_2_1 {

    public static void main(String[] args) {
        
	
        int[][] matrix = generateMatrix(6, 6);
        displayMatrix(matrix);
           boolean rowsOddOnes = checkRows(matrix);
        boolean columnsOddOnes = checkColumns(matrix);

        if (rowsOddOnes && columnsOddOnes) {
            System.out.println("Every row and column has an odd number of ones.");
        } else {
            System.out.println("Not every row and column has an odd number of ones.");
        }
    }
      public static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        Random rand = new Random();
            for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = rand.nextInt(2); 
            }
        }
       return matrix;
    }
       public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
       public static boolean checkRows(int[][] matrix) {
        for (int[] row : matrix) {
            int countOnes = 0;
            for (int element : row) {
                if (element == 1) {
                    countOnes++;
                }
            }
            if (countOnes % 2 == 0) {
                return false; 
            }
        }
        return true; 
    }
      public static boolean checkColumns(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int countOnes = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes % 2 == 0) {
                return false; 
            }
        }
        return true; 
    }
}
