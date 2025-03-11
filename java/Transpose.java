import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
        
        System.out.println("Original Matrix:");
        printMatrix(matrix, rows, cols);
        
        System.out.println("Transpose Matrix:");
        printMatrix(transpose(matrix, rows, cols), cols, rows);
        
        sc.close();
    }

    private static int[][] transpose(int[][] matrix, int rows, int cols) {
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    private static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}