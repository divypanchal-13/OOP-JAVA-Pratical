
import java.util.Scanner;

public class Pratical_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of Array 1 (3x3):");
        int[][] array1 = readMatrix(scanner, 3, 3);

        System.out.println("Enter elements of Array 2 (3x3):");
        int[][] array2 = readMatrix(scanner, 3, 3);

        System.out.println("Enter the operation (+, -, *):");
        char operation = scanner.next().charAt(0);

        int[][] result = performOperation(array1, array2, operation);

        System.out.println("Result:");
        printMatrix(result);

        scanner.close();
    }

    public static int[][] readMatrix(Scanner scanner, int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] performOperation(int[][] array1, int[][] array2, char operation) {
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                switch(operation) {
                    case '+':
                        result[i][j] = array1[i][j] + array2[i][j];
                        break;
                    case '-':
                        result[i][j] = array1[i][j] - array2[i][j];
                        break;
                    case '*':
                        result[i][j] = array1[i][j] * array2[i][j];
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        return null;
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

