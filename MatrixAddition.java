import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = 2;
        int cols = 2;

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];

        System.out.println("Enter the elements of matrix A (2x2):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix B (2x2):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Resulting Matrix C:");
        for (int[] row : C) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
